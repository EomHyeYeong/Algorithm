import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());

        for(int i = 0; i < repeat; i++) {
            int backingCount = 0;
            String[] inputs = br.readLine().split(" ");

            for (int j = 1; j < 21; j++) {
                int count = 0;
                int curr = Integer.parseInt(inputs[j]);
                for (int k = 1; k < j; k++) {
                    if (curr < Integer.parseInt(inputs[k])) count++;
                }

                backingCount += count;
            }
            System.out.printf("%d %d\n", i+1, backingCount);
        }
    }
}
