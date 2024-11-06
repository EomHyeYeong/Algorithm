import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for (int c = 0; c < testCase; c++) {
            String[] size = br.readLine().split(" ");
            int peopleCount = 0;
            int maxScore = 0;

            for (int i = 0; i < Integer.parseInt(size[0]); i++) {
                String[] result = br.readLine().split(" ");
                int score = 0;
                for (String s : result) {
                    if (s.equals("1")) score++;
                }

                if (maxScore < score) {
                    maxScore = score;
                    peopleCount = 1;
                }
                else if (maxScore == score)
                    peopleCount++;
            }
            System.out.printf("#%d %d %d\n", c+1, peopleCount, maxScore);
        }
    }
}