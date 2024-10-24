import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for(int tc = 0; tc < testCase; tc++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();

            int yy = n % h;
            int xx;
            if (yy == 0) {
                yy = h;
                xx = n / h;
            } else {
                xx = n / h + 1;
            }
            System.out.printf("%d%02d\n", yy, xx);
        }
    }
}
