import java.io.*;
import java.util.stream.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int c = 0; c < 10; c++) {
            int size = Integer.parseInt(br.readLine());
            int[] heights = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int count = 0;

            for (int i = 2; i < size-2; i++) {
                int maxHeight = 0;
                for (int j = i-2; j < i+3; j++) {
                    if (j == i) continue;
                    maxHeight = Math.max(maxHeight, heights[j]);
                }

                if (maxHeight < heights[i]) count += heights[i] - maxHeight;
                else continue;
            }

            System.out.printf("#%d %d\n", c+1, count);
        }
    }
}