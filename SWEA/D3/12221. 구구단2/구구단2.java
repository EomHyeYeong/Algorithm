import java.io.*;
import java.util.stream.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int c = 0; c < testCase; c++) {
            int[] numbers = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int multiply = -1;
            if (isMultiplyAvailable(numbers))
                multiply = numbers[0] * numbers[1];

            System.out.printf("#%d %d\n", c+1, multiply);
        }
    }

    static boolean isMultiplyAvailable(int[] numbers) {
        return numbers[0] < 10 && numbers[1] < 10;
    }
}