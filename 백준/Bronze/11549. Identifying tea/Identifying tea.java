import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = sc.next();
		sc.nextLine();
		
		String[] response = sc.nextLine().split(" ");
		int cnt = 0;
        sc.close();
		for(int i = 0; i < response.length; i++) {
			if(response[i].equals(answer))
				cnt++;
		}
		System.out.print(cnt);
	}
}