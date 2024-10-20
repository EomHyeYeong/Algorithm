import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());
        int[] count = new int[10001];

        for (int i = 0; i < repeat; i++) {
            int curr = Integer.parseInt(br.readLine());
            count[curr]++;
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 1; i < 10001; i++) {
            for(int j = 0; j < count[i]; j++)
                answer.append(i).append("\n");
        }

        System.out.print(answer);
    }
}
