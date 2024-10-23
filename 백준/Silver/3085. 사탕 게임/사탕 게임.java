import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[][] candyTable = initCandyTable(sc, size);

        // 끝 원소까지 순회하면서 상하좌우 캔디 변경, 줄 길이 체크
        playBomboni(candyTable);

    }

    static String[][] initCandyTable(Scanner sc, int size) {
        String[][] candyTable = new String[size][size];
        for (int i = 0; i < size; i++) {
            String str = sc.next();
            for (int j = 0; j < size; j++) {
                candyTable[i][j] = Character.toString(str.charAt(j));
            }
        }
        sc.close();
        return candyTable;
    }

    static void playBomboni(String[][] candyTable) {
        int[] rowChange = {-1, 1, 0, 0};
        int[] columnChange = {0, 0, -1, 1};
        int maxCandyCount = 0;

        for(int i = 0; i < candyTable.length; i++) {
            for (int j = 0; j < candyTable.length; j++) {
                for (int curr = 0; curr < 4; curr++) {
                    int rowMove = rowChange[curr];
                    int columnMove = columnChange[curr];
                    int row = i + rowMove;
                    int column = j + columnMove;

                    if (row < 0 || row >= candyTable.length || column < 0 || column >= candyTable.length)
                        continue;

                    String a = candyTable[i][j];
                    String b = candyTable[row][column];
                    candyTable[i][j] = b;
                    candyTable[row][column] = a;

                    // check 연속된 부분 (같은 행/열)
                    int candyA = checkEqualCandyCount(candyTable, i, j);
                    int candyB = checkEqualCandyCount(candyTable, row, column);
                    int candy = Math.max(candyA, candyB);
                    if (candy > maxCandyCount)
                        maxCandyCount = candy;

                    candyTable[i][j] = a;
                    candyTable[row][column] = b;
                }
            }
        }

        System.out.println(maxCandyCount);
    }

    static int checkEqualCandyCount(String[][] candyTable, int row, int column) {
        int rowCount = 1;
        int columnCount = 1;
        String currChar = candyTable[row][column];

        // 행
        for (int i = row + 1; i < candyTable.length; i++) {
            if (!candyTable[i][column].equals(currChar))
                break;
            rowCount++;
        }
        for (int i = row - 1; i > -1; i--) {
            if (!candyTable[i][column].equals(currChar))
                break;
            rowCount++;
        }

        // 열
        for (int i = column + 1; i < candyTable.length; i++) {
            if (!candyTable[row][i].equals(currChar))
                break;
            columnCount++;
        }
        for (int i = column - 1; i > -1; i--) {
            if (!candyTable[row][i].equals(currChar))
                break;
            columnCount++;
        }

        return Math.max(rowCount, columnCount);
    }
}
