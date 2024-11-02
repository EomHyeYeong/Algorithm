import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int c = 0; c < testCase; c++) {
            int n = Integer.parseInt(br.readLine());
            System.out.printf("#%d %d\n", c+1, n/3);
        }
    }
}