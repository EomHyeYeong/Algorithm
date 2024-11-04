import java.io.*;
import java.util.stream.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int c = 0; c < testCase; c++) {
            int[] studentsInfo = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] submittedStudentNumber = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] assignmentStatus = new int[studentsInfo[0]];

            for (int i = 0; i < studentsInfo[1]; i++) {
                assignmentStatus[submittedStudentNumber[i]-1]++;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < studentsInfo[0]; i++) {
                if (assignmentStatus[i] == 0) sb.append(i+1).append(" ");
            }

            System.out.printf("#%d %s\n", c+1, sb);
        }
    }
}