import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char maxChar = '?';
        int maxValue = 0;
        Map<Character, Integer> characters = new HashMap<>();

        // 알파벳 카운팅
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            curr = Character.toUpperCase(curr);
            if (characters.containsKey(curr)) {
                characters.put(curr, characters.get(curr) + 1);
            } else {
                characters.put(curr, 1);
            }
        }

        // 최대 사용 수 및 문자 maxValue, maxChar에 각각 저장
        for (Map.Entry<Character, Integer> entry : characters.entrySet()) {
            if (maxValue < entry.getValue()) {
                maxValue = entry.getValue();
                maxChar = entry.getKey();
            } else if (maxValue == entry.getValue()) {
                maxChar = '?';
            }
        }

        System.out.println(maxChar);
    }
}
