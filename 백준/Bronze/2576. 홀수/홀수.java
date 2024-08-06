import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int min = 100;	
		
		for(int i = 0; i < 7; i++) {
			int comp = sc.nextInt();
			if (comp % 2 != 0) {
				if(min > comp)
					min = comp;
				sum += comp;
			}
		}
		
		if(min != 100) {
			System.out.println(sum);
			System.out.println(min);
		} else {
			System.out.println("-1");
		}
	}
}