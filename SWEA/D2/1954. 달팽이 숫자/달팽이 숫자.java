import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int c = 0; c < t; c++) {
            int n = sc.nextInt();
            System.out.printf("#%d\n", c+1);
            makeSnailNumber(n);
        }
    }

    static void makeSnailNumber(int n) {
        int[][] snailNumber = new int[n][n];
        snailNumber[0][0] = 1;

        int row = 0;
        int column = 0;
        int direction = 0;
        int number = 2;

        while (number <= n * n) {
            // 현재 방향으로 진행
            int plus = 1;
            if (direction == 1 || direction == 3) plus = -1;

            if (direction < 2) { // 수평 이동
                while (true) {
                    int move = column + plus;
                    if (move < 0 || move > snailNumber.length - 1) break;
                    if (snailNumber[row][move] != 0) break;
                    snailNumber[row][move] = number++;
                    column = move;
                }

            } else { // 수직 이동
                while (true) {
                    int move = row + plus;
                    if (move < 0 || move > snailNumber.length - 1) break;
                    if (snailNumber[move][column] != 0) break;
                    snailNumber[move][column] = number++;
                    row = move;
                }
            }

            // 방향 바꿔주기, row/column -= 1;
            direction = (direction + 1) % 4;
        }

        // 결과 배열 출력하기
        printSnailNumber(snailNumber);
    }

    static void printSnailNumber(int[][] snailNumber) {
        int n = snailNumber.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(snailNumber[i][j] + " ");
            }
            System.out.println();
        }
    }
}
