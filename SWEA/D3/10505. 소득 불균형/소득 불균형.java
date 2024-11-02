import java.io.*;
import java.util.stream.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int c = 0; c < testCase; c++) {
            int n = Integer.parseInt(br.readLine());
            int[] earnings = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int total = 0;

            // 평균값 구하기
            for (int i = 0; i < n; i++) {
                total += earnings[i];
            }
            double avg = (float) total / n;

            // 평균 이하 카운팅
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (earnings[i] <= avg) count++;
            }

            System.out.printf("#%d %d\n", c+1, count);
        }
    }
}