import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int c = 0; c < testCase; c++) {
            String[] numbers = br.readLine().split(" ");
            int min = 100000;
            int max = -1;

            for (int i = 0; i < 10; i++) {
                String curr = numbers[i];
                int sumCurr = 0;
                for (int j = 0; j < curr.length(); j++) {
                    sumCurr += Character.digit(curr.charAt(j), 10);
                }
                min = Math.min(min, sumCurr);
                max = Math.max(max, sumCurr);
            }

            System.out.printf("#%d %d %d\n", c+1, max, min);
        }
    }
}