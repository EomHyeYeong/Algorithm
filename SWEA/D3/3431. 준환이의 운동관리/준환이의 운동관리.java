import java.io.*;
import java.util.stream.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int c = 0; c < testCase; c++) {
            int[] times = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int status = -1;
            if (times[1] >= times[2]) {
                if (times[0] > times[2]) status = times[0] - times[2];
                else status = 0;
            }
            System.out.printf("#%d %d\n", c+1, status);
        }
    }
}
