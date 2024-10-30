import java.io.*;
import java.util.stream.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for (int c = 0; c < testCase; c++) {
            int[] size = initIntegerArray(br.readLine());
            int[] a;
            int[] b;

            // 더 긴 배열을 b 배열로
            if (size[0] > size[1]) {
                b = initIntegerArray(br.readLine());
                a = initIntegerArray(br.readLine());

            } else {
                a = initIntegerArray(br.readLine());
                b = initIntegerArray(br.readLine());
            }

            // 마주보는 숫자 곱의 최댓값 구하기
            int max = calculateMaxFacingNumber(a, b);
            System.out.printf("#%d %d\n", c+1, max);
        }
    }

    static int[] initIntegerArray(String input) {
        return Stream.of(input.split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    static int calculateMaxFacingNumber(int[] a, int[] b) {
        int max = -1000;
        int diff = b.length - a.length + 1;
        int startB = 0;

        for (int i = 0; i < diff; i++) {
            int calc = 0;

            for (int j = 0; j < a.length; j++) {
                calc += a[j] * b[startB + j];
            }
            startB++;
            if (calc > max) max = calc;
        }
        return max;
    }
}