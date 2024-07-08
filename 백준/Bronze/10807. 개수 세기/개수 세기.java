import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number_cnt = sc.nextInt();
		sc.nextLine();
		
		String[] list = sc.nextLine().split(" ");
		int target = sc.nextInt();
		
		int target_cnt = 0;
		for (int i = 0; i < number_cnt; i++) {
			int num = Integer.parseInt(list[i]);
			if (num == target)
				target_cnt++;
		}
		System.out.println(target_cnt);
	}
}
