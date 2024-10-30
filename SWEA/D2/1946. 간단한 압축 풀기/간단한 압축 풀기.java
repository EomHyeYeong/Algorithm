import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int c = 0; c < testCase; c++) {
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < n; i++) {
                String alphabet = sc.next();
                int alphabetCount = sc.nextInt();

                for (int count = 0; count < alphabetCount; count++) {
                    sb.append(alphabet);
                }
            }

            String document = sb.toString();
            int stringLength = sb.length();
            int repeat = stringLength / 10;
            if (stringLength % 10 != 0) repeat += 1;

            System.out.println("#" + (c+1));
            for (int i = 0; i < repeat; i++) {
                int start = i * 10;
                if (start + 10 > stringLength)
                    System.out.println(document.substring(start));
                else
                    System.out.println(document.substring(start, start+10));
            }
        }
    }
}