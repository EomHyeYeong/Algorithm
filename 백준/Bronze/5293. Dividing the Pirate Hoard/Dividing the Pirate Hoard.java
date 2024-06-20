import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		int divide;
		
		for (int i = 0; i < n; i++) {
			divide = (m / n) + (m % n);
			m  -= divide;
			System.out.print(divide + " ");
		}
		System.out.println("\n" + m);
	}

}