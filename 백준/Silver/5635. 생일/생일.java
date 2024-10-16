import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int rotate = Integer.parseInt(br.readLine());
        String[][] students = new String[rotate][4];
        int[] birthdays = new int[rotate];

        for (int i = 0; i < rotate; i++) {
            String input = br.readLine();
            students[i] = input.split(" ");

            int year = Integer.parseInt(students[i][3]);
            int month = Integer.parseInt(students[i][2]);
            int day = Integer.parseInt(students[i][1]);
            birthdays[i] = year * 365 + month * 30 + day;
        }

        int min = 3000 * 365;
        int minIdx = -1;
        int max = 0;
        int maxIdx = -1;
        for (int i = 0; i < rotate; i++) {
            if (birthdays[i] < min) {
                min = birthdays[i];
                minIdx = i;
            }
            if (birthdays[i] > max) {
                max = birthdays[i];
                maxIdx = i;
            }
        }
        System.out.println(students[maxIdx][0]);
        System.out.println(students[minIdx][0]);
    }
}
