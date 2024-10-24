import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[][] board = initBoard(n);
        String command = br.readLine();

        runCommand(board, command);
        printBoard(board);
    }

    static char[][] initBoard(int n) {
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        return board;
    }

    static void runCommand(char[][] board, String command) {
        int row = 0;
        int column = 0;

        for (int idx = 0; idx < command.length(); idx++) {
            char currCommand = command.charAt(idx);
            int[] movedLocation = moveLocation(row, column, currCommand, board.length);

            if (movedLocation[2] == -1)
                continue;

            // 판화 조각 업데이트
            updateBoard(board, row, column, movedLocation[2]);
            updateBoard(board, movedLocation[0], movedLocation[1], movedLocation[2]);

            row = movedLocation[0];
            column = movedLocation[1];
        }
    }

    static int[] moveLocation(int row, int column, char command, int n) {
        int[] movedLocation = new int[3];

        if (command == 'U') {
            movedLocation[0] = row - 1;
            movedLocation[1] = column;
        }

        if (command == 'D') {
            movedLocation[0] = row + 1;
            movedLocation[1] = column;
            movedLocation[2] = 1;
        }

        if (command == 'L') {
            movedLocation[0] = row;
            movedLocation[1] = column - 1;
            movedLocation[2] = 2;
        }

        if (command == 'R') {
            movedLocation[0] = row;
            movedLocation[1] = column + 1;
            movedLocation[2] = 3;
        }

        // 범위 체크
        if (movedLocation[0] < 0 || movedLocation[0] >= n || movedLocation[1] < 0 || movedLocation[1] >= n)
            movedLocation[2] = -1;

        return movedLocation;
    }

    static void updateBoard(char[][] board, int row, int column, int moveTo) {
        if (board[row][column] == '-' && moveTo < 2) board[row][column] = '+';
        else if (board[row][column] == '|' && moveTo > 1) board[row][column] = '+';
        else if (board[row][column] == '+');
        else {
            if (moveTo < 2) {
                board[row][column] = '|';
            }
            else {
                board[row][column] = '-';
            }
        }
    }

    static void printBoard(char[][] board) {
        int n = board.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}