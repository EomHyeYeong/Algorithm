import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int c = 0; c < testCase; c++) {
            String memory = br.readLine();
            char written = '0';
            int count = 0;

            for (int i = 0; i < memory.length(); i++) {
                char curr = memory.charAt(i);
                if (curr != written) {
                    count++;
                    written = curr;
                }
            }

            System.out.printf("#%d %d\n", c+1, count);
        }
    }
}