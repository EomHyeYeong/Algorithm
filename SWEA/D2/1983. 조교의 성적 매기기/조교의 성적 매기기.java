import java.io.*;
import java.util.stream.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        String[] rating = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};

        for (int c = 0; c < testCase; c++) {
            int[] studentInfo = convertStringToScore(br.readLine());
            double[] totalScore = new double[studentInfo[0]];
            int[] studentRating = new int[studentInfo[0]];
            int equalAbleRatingCount = studentInfo[0] / 10;

            for (int i = 0; i < studentInfo[0]; i++) {
                int[] score = convertStringToScore(br.readLine());
                totalScore[i] = score[0]*(0.35) + score[1]*0.45 + score[2]*(0.2);
            }

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < equalAbleRatingCount; j++) {
                    double max = -1;
                    int maxIdx = -1
                            ;
                    // totalScore -> max 값 찾아서 동일 인덱스의 studentRating 에 i 값 저장
                    for (int curr = 0; curr < studentInfo[0]; curr++) {
                        if (totalScore[curr] > max) {
                            max = totalScore[curr];
                            maxIdx = curr;
                        }
                    }

                    studentRating[maxIdx] = i;
                    totalScore[maxIdx] = 0;
                }
            }

            System.out.printf("#%d %s\n", c+1, rating[studentRating[studentInfo[1]-1]]);
        }
    }

    static int[] convertStringToScore(String input) {
        return Stream.of(input.split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}