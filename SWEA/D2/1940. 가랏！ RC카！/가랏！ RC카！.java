import java.io.*;
import java.util.stream.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int c = 0; c <testCase; c++) {
            int commandCount = Integer.parseInt(br.readLine());
            int acceleration = 0;
            int distance = 0;
            for (int i = 0; i < commandCount; i++) {
                int[] commands = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                if (commands[0] == 1)
                    acceleration += commands[1];
                else if (commands[0] == 2) {
                    if (acceleration - commands[1] < 0)
                        acceleration = 0;
                    else
                        acceleration -= commands[1];
                }
                distance += acceleration;

            }
            System.out.printf("#%d %d\n", c+1, distance);
        }
    }
}