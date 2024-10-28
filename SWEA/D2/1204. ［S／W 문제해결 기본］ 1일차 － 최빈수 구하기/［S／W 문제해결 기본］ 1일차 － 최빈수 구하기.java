import java.io.*;
import java.util.stream.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int c = 0; c < t; c++) {
            int number = Integer.parseInt(br.readLine());
            int[] scores = convertStringToInteger(br.readLine());

            int frequentScore = findFrequentScore(scores);
            System.out.println("#" + number + " " + frequentScore);
        }
    }

    static int[] convertStringToInteger(String input) {
        return Stream.of(input.split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    static int findFrequentScore(int[] scores) {
        int[] scoreArray = new int[101];

        for (int i = 0; i < scores.length; i++) {
            int curr = scores[i];
            scoreArray[curr]++;
        }

        int max = 0;
        int maxScore = 0;
        for (int i = 0; i < scoreArray.length; i++) {
            if (max <= scoreArray[i]) {
                max = scoreArray[i];
                maxScore = i;
            }
        }

        return maxScore;
    }
}