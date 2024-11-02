import java.io.*;
import java.util.stream.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int c = 0; c < testCase; c++) {
            int n = Integer.parseInt(br.readLine());
            int[] heights = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int maxUp = 0;
            int maxDown = 0;

            for (int i = 0; i < n; i++) {
                // i+1로 올라갈 때 차이
                if (isUpAvailable(n, i)) {
                    int up = heights[i+1] - heights[i];
                    if (maxUp < up) maxUp = up;
                }

                // i-1에서 내려올 때 차이
                if (isDownAvailable(n, i)) {
                    int down = heights[i-1] - heights[i];
                    if (maxDown < down) maxDown = down;
                }
            }
            
            System.out.printf("#%d %d %d\n", c+1, maxUp, maxDown);
        }
    }

    static boolean isUpAvailable(int n, int curr) {
        return curr+1 < n;
    }

    static boolean isDownAvailable(int n, int curr) {
        return curr-1 >= 0;
    }
}