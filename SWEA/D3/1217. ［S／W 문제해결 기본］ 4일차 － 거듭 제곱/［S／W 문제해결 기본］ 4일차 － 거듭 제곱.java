import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        for (int c = 0; c < 10; c++) {
            int caseNumber = sc.nextInt();
            int base = sc.nextInt();
            int exponent = sc.nextInt();

            int result = calculateSquare(base, exponent);
            System.out.printf("#%d %d\n", caseNumber, result);
        }
        sc.close();
    }

    static int calculateSquare(int base, int exponent) {
        if (exponent > 0)
            return base * calculateSquare(base, exponent - 1);
        return 1;
    }
}