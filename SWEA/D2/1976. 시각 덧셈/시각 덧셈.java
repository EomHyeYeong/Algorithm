import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int c = 0; c < testCase; c++) {
            int hourA = sc.nextInt();
            int minuteA = sc.nextInt();
            int totalAB = hourA * 60 + minuteA;

            int hourB = sc.nextInt();
            int minuteB = sc.nextInt();
            totalAB += hourB * 60 + minuteB;

            int hour = (totalAB / 60) % 12;
            if (hour == 0) hour = 12;
            int minute = totalAB % 60;

            System.out.printf("#%d %d %d\n", c+1, hour, minute);

        }
        sc.close();
    }
}