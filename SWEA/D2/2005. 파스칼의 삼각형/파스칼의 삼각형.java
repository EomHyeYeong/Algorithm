import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int c = 0; c < testCase; c++) {
            int n = sc.nextInt();
            int[] preTriangle = {1};

            System.out.printf("#%d\n", c+1);
            System.out.println(1);

            // 한 파스칼 삼각형
            for (int i = 0; i < n-1; i++) {
                StringBuilder sb = new StringBuilder();
                int[] currTriangle = new int[preTriangle.length+1];

                // 한 줄
                for (int j = 0; j < currTriangle.length; j++) {
                    // j-1, j 비교
                    currTriangle[j] = getNumberForPreTriangle(preTriangle, j-1) + getNumberForPreTriangle(preTriangle, j);
                    sb.append(currTriangle[j] + " ");
                }
                preTriangle = currTriangle;
                System.out.println(sb);
            }
        }
    }

    static int getNumberForPreTriangle(int[] preTriangle, int idx) {
        if (idx < 0 || idx == preTriangle.length) return 0;
        return preTriangle[idx];
    }
}
