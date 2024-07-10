import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		
		v -= a;
		int day = 1;
		if (v == 0)
			System.out.println(1);
		else if(v < a-b)
			System.out.println(2);
		else {
			int div = v/(a-b);
			int remain = v % (a-b);
			
			if (remain > 0)
				day += 1;
			day += div;
			System.out.println(day);
		}
	}
}
