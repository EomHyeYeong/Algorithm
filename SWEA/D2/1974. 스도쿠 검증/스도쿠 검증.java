import java.io.*;
import java.util.stream.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int c = 0; c < t; c++) {
            // 9 * 9 배열 선언, 입력받아 초기화
            int[][] sudoku = initSudoku(br);

            // 가로 검증
            if (verifyRow(sudoku)) {
                System.out.printf("#%d 0\n", c+1);
                continue;
            }

            // 세로 검증
            if (verifyColumn(sudoku)) {
                System.out.printf("#%d 0\n", c+1);
                continue;
            }

            // 3 * 3 검증
            if (verifyBlock(sudoku)) {
                System.out.printf("#%d 0\n", c+1);
                continue;
            }

            // 1 출력
            System.out.printf("#%d 1\n", c+1);
        }
    }

    static int[][] initSudoku(BufferedReader br) throws Exception {
        int[][] sudoku = new int[9][];
        for (int i = 0; i < 9; i++) {
            String str = br.readLine();
            sudoku[i] = Stream.of(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        return sudoku;
    }

    // 가로 검증
    static boolean verifyRow(int[][] sudoku) {
        boolean isNotValid = false;
        for (int i = 0; i < 9; i++) {
            int[] number = new int[10];
            for (int j = 0; j < 9; j++) {
                number[sudoku[i][j]]++;
            }

            for (int j = 1; j < 10; j++) {
                if (number[j] != 1) {
                    isNotValid = true;
                    break;
                }
            }
            if (isNotValid) break;
        }
        return isNotValid;
    }

    // 세로 검증
    static boolean verifyColumn(int[][] sudoku) {
        boolean isNotValid = false;
        for (int i = 0; i < 9; i++) {
            int[] number = new int[10];
            for (int j = 0; j < 9; j++) {
                number[sudoku[j][i]]++;
            }

            for (int j = 1; j < 10; j++) {
                if (number[j] != 1) {
                    isNotValid = true;
                    break;
                }
            }
            if (isNotValid) break;
        }
        return isNotValid;
    }

    // 3 * 3 검증
    static boolean verifyBlock(int[][] sudoku) {
        boolean isNotValid = false;
        int[] start = {0, 3, 6};

        for (int r = 0; r < 3; r++) {
            for (int l = 0; l < 3; l++) {
                int startRow = start[r];
                int startColumn = start[l];
                int[] number = new int[10];

                for (int i = startRow; i < startRow+3; i++) {
                    for (int j = startColumn; j < startColumn+3; j++) {
                        number[sudoku[i][j]]++;
                    }
                }

                for (int j = 1; j < 10; j++) {
                    if (number[j] != 1) {
                        isNotValid = true;
                        break;
                    }
                }
                if (isNotValid) break;
            }
            if (isNotValid) break;
        }
        return isNotValid;
    }
}