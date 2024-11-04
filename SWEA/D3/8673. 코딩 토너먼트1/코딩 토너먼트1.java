import java.io.*;
import java.util.stream.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int c = 0; c < testCase; c++) {
            int k = Integer.parseInt(br.readLine());
            int[] skill = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] nextRound = new int[skill.length / 2];
            int boring = 0;

            for (int round = 0; round < k; round++) {
                // 지루한 정도 계산
                int idx = 0;
                for (int i = 0; i < skill.length; i += 2) {
                    nextRound[idx++] = Math.max(skill[i], skill[i+1]);
                    boring += Math.abs(skill[i] - skill[i+1]);
                }
                skill = nextRound;
                nextRound = new int[skill.length / 2];
            }

            System.out.printf("#%d %d\n", c+1, boring);
        }
    }
}