import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if(curr >= 65 && curr <= 90) {
                System.out.print(Character.toLowerCase(curr));
            } else {
                System.out.print(Character.toUpperCase(curr));
            }
        }
    }
}