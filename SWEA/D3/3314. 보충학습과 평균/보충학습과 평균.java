import java.io.*;
import java.util.stream.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine().trim());

        for (int c = 0; c < testCase; c++) {
            int[] scores = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int total = 0;

            for (int i = 0; i < scores.length; i++) {
                if (scores[i] < 40) total += 40;
                else total += scores[i];
            }
            System.out.printf("#%d %d\n", c+1, total / 5);
        }
    }
}