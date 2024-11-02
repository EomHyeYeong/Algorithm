import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int c = 0; c < testCase; c++) {
            int n = Integer.parseInt(br.readLine());
            int count = 0;

            for (int x = 1; x < n; x++) {
                int y = 1;
                int comp = 2;

                while (comp <= (int)Math.pow(n, 2)) {
                    count++;
                    y++;
                    comp = (int)Math.pow(x, 2) + (int)Math.pow(y, 2);
                }
            }
            count *= 4;
            count += 4 * n + 1;
            System.out.printf("#%d %d\n", c+1, count);
        }
    }
}