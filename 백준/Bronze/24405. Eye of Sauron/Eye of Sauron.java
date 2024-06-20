import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String eye = sc.next();
		sc.close();
		
		String[] divide = eye.split("\\(\\)");
		if(divide[0].equals(divide[1]))
			System.out.println("correct");
		else
			System.out.println("fix");
	}

}