import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < size; i++) {
			String[] line = sc.nextLine().split(" ");
			double cost = Double.parseDouble(line[0]) *
					Double.parseDouble(line[1]) *
					Double.parseDouble(line[2]);
			System.out.printf("$%.2f\n", cost);
		}
		sc.close();
	}
}