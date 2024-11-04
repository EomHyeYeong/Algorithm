import java.io.*;
import java.util.stream.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int c = 0; c < testCase; c++) {
            int[] numbers = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int count = 0;

            for (int i = numbers[0]; i < numbers[1]+1; i++) {
                double sqrt = Math.sqrt(i);
                if (sqrt != Math.floor(sqrt)) continue;

                StringBuffer sb = new StringBuffer();
                String reverse = sb.append(i).reverse().toString();
                if (!String.valueOf(i).equals(reverse)) continue;

                sb = new StringBuffer();
                reverse = sb.append((int)sqrt).reverse().toString();
                if (!String.valueOf((int)sqrt).equals(reverse)) continue;

                count++;
            }

            System.out.printf("#%d %d\n", c+1, count);
        }
    }
}