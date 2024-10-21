import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] circleNumber = initCircleNumber();

        int testCase = Integer.parseInt(br.readLine());
        for (int curr = 0; curr < testCase; curr++) {
            int k = Integer.parseInt(br.readLine());
            boolean find = false;

            for (int i = 1; i < 50; i++) {
                if (circleNumber[i] > k) break;
                for (int j = 1; j < 50; j++) {
                    if (circleNumber[i] + circleNumber[j] > k) break;
                    for (int l = 1; l < 50; l++) {
                        if (circleNumber[i] + circleNumber[j] + circleNumber[l] > k) break;
                        if (circleNumber[i] + circleNumber[j] + circleNumber[l] == k) {
                            find = true;
                            break;
                        }
                    }
                    if (find) break;
                }
                if (find) break;
            }

            if (find)
                System.out.println(1);
            else
                System.out.println(0);
        }
    }

    public static int[] initCircleNumber() {
        int[] circleNumber = new int[50];
        circleNumber[1] = 1;
        for (int i = 2; i < 50; i++) {
            circleNumber[i] = circleNumber[i-1] + i;
        }
        return circleNumber;
    }
}