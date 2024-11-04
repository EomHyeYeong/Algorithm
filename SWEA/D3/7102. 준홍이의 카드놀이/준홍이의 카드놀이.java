import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int c = 0; c < testCase; c++) {
            int[] cards = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] total = new int[cards[0] + cards[1] + 1];

            // 카드 합 계산
            for (int i = 0; i < cards[0]; i++) {
                for (int j = 0; j < cards[1]; j++) {
                    int curr = i+1 + j+1;
                    total[curr]++;
                }
            }

            int max = Arrays.stream(total).max().getAsInt();
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < total.length; i++) {
                if (total[i]==max) sb.append(i).append(" ");
            }
            System.out.printf("#%d %s\n", c+1, sb);
        }
    }
}