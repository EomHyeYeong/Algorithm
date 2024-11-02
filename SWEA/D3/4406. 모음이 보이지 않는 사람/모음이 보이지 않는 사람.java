import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        for (int c = 0; c < testCase; c++) {
            String str = br.readLine();
            System.out.print("#" + (c+1) + " ");
            for (int i = 0; i < str.length(); i++) {
                char curr = str.charAt(i);
                if (vowels.contains(curr)) continue;
                System.out.print(curr);
            }
            System.out.println();
        }
    }
}