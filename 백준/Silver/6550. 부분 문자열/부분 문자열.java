import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // EOF
        while (true) {
            String str = br.readLine();
            if (str == null)
                break;

            String[] st = str.split(" ");

            int startIdx = -1;
            String isInclude = "Yes";

            for (int i = 0; i < st[0].length(); i++) {
                char curr = st[0].charAt(i);
                int findIdx = st[1].indexOf(curr, startIdx);

                if (findIdx < 0) {
                    isInclude = "No";
                    break;
                }
                startIdx = findIdx + 1;
            }
            System.out.println(isInclude);
        }
    }
}
