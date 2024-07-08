import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] list = sc.nextLine().split(" ");
		
		int total = 0;
		for(int i = 0; i < list.length; i++) {
			int n = Integer.parseInt(list[i]);
			total += n*n;
		}
		System.out.println(total%10);
	}
}
