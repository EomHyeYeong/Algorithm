import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int c = 0; c < testCase; c++) {
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append("1/").append(n).append(" ");
            }

            System.out.printf("#%d %s\n", c+1, sb);
        }
    }
}