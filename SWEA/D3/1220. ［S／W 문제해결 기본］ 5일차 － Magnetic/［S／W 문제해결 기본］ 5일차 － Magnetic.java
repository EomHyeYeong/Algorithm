import java.io.*;
import java.util.stream.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int c = 0; c < 10; c++) {
            int len = Integer.parseInt(br.readLine());
            int[][] table = setTable(br, len);
            int count = 0;

            for (int i = 0; i < len; i++) {
                // column 위에 있는 자성체 모음
                String magneticMaterial = getMagneticMaterialColumn(table, i);

                // 교착상태 개수 세기
                if (!magneticMaterial.isEmpty())
                    count += countDeadLock(magneticMaterial);
            }

            System.out.printf("#%d %d\n", c+1, count);
        }
    }

    static int[][] setTable(BufferedReader br, int len) throws Exception {
        int[][] table = new int[len][];
        for (int i = 0; i < len; i++) {
            table[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        return table;
    }

    static String getMagneticMaterialColumn(int[][] table, int col) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < table.length; i++) {
            if (table[i][col] == 0) continue;
            sb.append(table[i][col]);
        }

        if (sb.length() < 1) return sb.toString();
        // 왼쪽에서 2, 오른쪽에서 1 제거
        char left = sb.charAt(0);
        while (left == '2') {
            sb.deleteCharAt(0);
            if (sb.length() < 1) return sb.toString();
            left = sb.charAt(0);
        }

        if (sb.length() < 1) return sb.toString();
        char right = sb.charAt(sb.length()-1);
        while (right == '1') {
            sb.deleteCharAt(sb.length()-1);
            if (sb.length() < 1) return sb.toString();
            right = sb.charAt(sb.length()-1);
        }

        return sb.toString();
    }

    static int countDeadLock(String m) {
        int count = 1;

        char preState = m.charAt(0);
        for (int i = 1; i < m.length(); i++) {
            char currState = m.charAt(i);
            if (preState == '2' && currState == '1')
                count++;
            preState = currState;
        }

        return count;
    }
}