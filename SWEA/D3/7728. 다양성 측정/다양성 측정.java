import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int c = 0; c < testCase; c++) {
            String number = br.readLine();
            Set<Character> numberSet = new HashSet<>();

            for (int i = 0; i < number.length(); i++) {
                char curr = number.charAt(i);
                numberSet.add(curr);
            }

            System.out.printf("#%d %d\n", c+1, numberSet.size());
        }
    }
}