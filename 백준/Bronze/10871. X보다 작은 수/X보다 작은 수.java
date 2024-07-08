import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		sc.nextLine();
		String[] list = sc.nextLine().split(" ");
		for (int i = 0; i < list.length; i++) {
			int curr = Integer.parseInt(list[i]);
			
			if (curr < x)
				System.out.print(curr + " ");
		}
	}
}
