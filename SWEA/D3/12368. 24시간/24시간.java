import java.io.*;
import java.util.stream.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine().trim());

        for (int c = 0; c < testCase; c++) {
            int[] times = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int calculateTime = (times[0] + times[1]) % 24;
            System.out.printf("#%d %d\n", c+1, calculateTime);
        }
    }
}
