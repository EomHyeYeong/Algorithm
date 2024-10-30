import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int c = 0; c < testCase; c++) {
            int monthA = sc.nextInt();
            int dayA = sc.nextInt();
            int totalA = dayConverter(monthA, dayA);

            int monthB = sc.nextInt();
            int dayB = sc.nextInt();
            int totalB = dayConverter(monthB, dayB);

            System.out.printf("#%d %d\n", c+1, totalB - totalA + 1);
        }
    }

    static int dayConverter(int month, int day) {
        int[] lastDay = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int newDay = day;
        for (int i = 1; i < month; i++) {
            newDay += lastDay[i];
        }

        return newDay;
    }
}