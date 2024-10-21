import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        int[] remains = new int[30];
        int pointer = 0;

        while (n >= b) {
            remains[pointer++] = n % b;
            n /= b;
        }
        remains[pointer] = n;

        StringBuilder sb = new StringBuilder();;
        for(int i = pointer; i > -1; i--) {
            sb.append(converter(remains[i]));
        }
        System.out.println(sb);
    }

    public static char converter(int number) {
        if (number < 10)
            return Character.forDigit(number, 10);
        return (char) (number - 10 + 'A');
    }
}