import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String[] wheel = initWheel(n);
        int[] count = new int[26];

        int idx = 0;
        for (int i = 0; i < k; i++) {
            int movement = sc.nextInt();
            String alphabet = sc.next();

            idx += movement;
            if (idx >= n) idx %= n;
            if (isNotWheelValid(wheel, idx, alphabet, count))
                return;
            wheel[idx] = alphabet;
        }
        if (isNotAlphabetCountValid(count)) return;
        printWheel(wheel, idx);
    }

    static String[] initWheel(int n) {
        String[] wheel = new String[n];

        for (int i = 0; i < n; i++)
            wheel[i] = "?";
        return wheel;
    }

    static boolean isNotWheelValid(String[] wheel, int idx, String alphabet, int[] count) {
        if (wheel[idx].equals(alphabet)) return false;
        if (wheel[idx].equals("?")) {
            int alphabetIdx = alphabet.charAt(0) - 'A';
            count[alphabetIdx]++;
            return false;
        }
        System.out.println("!");
        return true;
    }

    static boolean isNotAlphabetCountValid(int[] count) {
        for (int i = 0; i < 26; i++) {
            if (count[i] > 1) {
                System.out.println("!");
                return true;
            }
        }
        return false;
    }

    static void printWheel(String[] wheel, int idx) {
        for (int i = 0; i < wheel.length; i++) {
            int currIdx = idx - i;
            if (currIdx < 0)
                currIdx = wheel.length + currIdx;
            System.out.print(wheel[currIdx]);
        }
    }
}