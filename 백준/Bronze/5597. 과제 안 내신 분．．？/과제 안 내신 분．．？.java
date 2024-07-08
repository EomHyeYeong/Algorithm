import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] isSubmit = new boolean[31];
		isSubmit[0] = true;
		
		for(int i = 0; i < 28; i++) {
			int n = sc.nextInt();
			isSubmit[n] = true;
		}
		
		for(int i = 0; i < 31; i++) {
			if(isSubmit[i] == false)
				System.out.println(i);
		}
	}
}
