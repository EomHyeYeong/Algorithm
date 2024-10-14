import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        boolean maxNotOne =  false;
        char maxChar = '?';
        int maxValue = 0;
        Map<Character, Integer> characters = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            curr = Character.toUpperCase(curr);
            if (characters.containsKey(curr)) {
                characters.put(curr, characters.get(curr) + 1);
            } else {
                characters.put(curr, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : characters.entrySet()) {
            if (maxValue < entry.getValue()) {
                maxValue = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        for (Map.Entry<Character, Integer> entry : characters.entrySet()) {
            if (entry.getValue().equals(maxValue) && !entry.getKey().equals(maxChar)) {
                maxNotOne = true;
            }
        }

        if (maxNotOne) {
            System.out.println("?");
        } else {
            System.out.println(maxChar);
        }
    }
}
