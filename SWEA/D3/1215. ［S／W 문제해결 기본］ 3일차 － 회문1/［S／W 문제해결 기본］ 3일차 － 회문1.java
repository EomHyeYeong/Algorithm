import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int c = 0; c < 10; c++) {
            int n = Integer.parseInt(br.readLine());
            String[] board = setBoard(br);
            int count = 0;

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    // 가로 비교
                    if (isCompareAble(j, n)) {
                        String str = board[i].substring(j, j+n);
                        if (isPalindrome(str)) count++;
                    }

                    // 세로 비교
                    if (isCompareAble(i, n)) {
                        String str = extractVerticalStringFromBoard(board, i, j, n);
                        if (isPalindrome(str)) count++;
                    }
                }
            }

            System.out.printf("#%d %d\n", c+1, count);

        }
    }

    static String[] setBoard(BufferedReader br) throws Exception {
        String[] board = new String[8];
        for (int i = 0; i < 8; i++) {
            board[i] = br.readLine();
        }
        return board;
    }

    static boolean isCompareAble(int idx, int n) {
        return (idx + n - 1) < 8;
    }

    static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder();
        String rev = sb.append(str).reverse().toString();
        return str.equals(rev);
    }

    static String extractVerticalStringFromBoard(String[] board, int i, int j, int n) {
        StringBuilder sb = new StringBuilder();

        for (int c = i; c < i+n; c++) {
            sb.append(board[c].charAt(j));
        }

        return sb.toString();
    }
}