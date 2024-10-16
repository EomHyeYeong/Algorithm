import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        Map<Character, Integer> charCountStr1 = new HashMap<>();
        Map<Character, Integer> charCountStr2 = new HashMap<>();

        int maxLength = Integer.max(str1.length(), str2.length());

        // charCount 로 문자 개수 세기
        int repeat = 'z' - 'a' + 1;
        for (int i = 0; i < repeat; i++) {
            int countStr1 = 0;
            int countStr2 = 0;
            char compChar = (char)('a' + i);

            for (int j = 0; j < maxLength; j++) {
                if (str1.length() > j) {
                    if (str1.charAt(j) == compChar)
                        countStr1++;
                }

                if (str2.length() > j) {
                    if (str2.charAt(j) == compChar)
                        countStr2++;
                }
            }

            charCountStr1.put(compChar, countStr1);
            charCountStr2.put(compChar, countStr2);
        }

        // 가지고 있는 문자 개수 비교
        int equalCharCount = 0;
        for (int i = 0; i < repeat; i++) {
            char curr = (char)('a' + i);
            int ch1 = charCountStr1.get(curr);
            int ch2 = charCountStr2.get(curr);

            if (ch1 == ch2) {
                equalCharCount += ch1 * 2;
            } else {
                equalCharCount += Integer.min(ch1, ch2) * 2;
            }
        }

        int totalCharCount = str1.length() + str2.length();
        System.out.println(totalCharCount - equalCharCount);
    }
}
