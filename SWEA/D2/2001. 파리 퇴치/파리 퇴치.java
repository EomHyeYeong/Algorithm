import java.io.*;
import java.util.stream.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int c = 0; c < t; c++) {
            String[] size = br.readLine().split(" ");
            int n = Integer.parseInt(size[0]);
            int m = Integer.parseInt(size[1]);
            int calc = n - m + 1;
            int[][] flyLocation = getFlyLocation(br, n);
            int max = 0;

            for (int i = 0; i < calc; i++) {
                for (int j = 0; j < calc; j++) {
                    int flyCount = catchFly(flyLocation, i, j, m);
                    if (flyCount > max) max = flyCount;
                }
            }

            System.out.println("#" + (c+1) + " " + max);
        }
    }

    static int[][] getFlyLocation(BufferedReader br, int n) throws Exception {
        int[][] flyLocation = new int[n][n];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            flyLocation[i] = Stream.of(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        return flyLocation;
    }

    static int catchFly(int[][] flyLocation, int row, int column, int m) {
        int flyCount = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                flyCount += flyLocation[row + i][column + j];
            }
        }
        return flyCount;
    }
}