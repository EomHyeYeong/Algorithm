import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i = 0; i < testCase; i++) {
			String str = sc.next();
			
			int cnt = 0;
			int totalScore = 0;
			int addedScore = 0;
			
			for(int j = 0; j < str.length(); j++) {
				char c = str.charAt(j);
				
				if(c == 'O') {
					cnt += 1;
				}
				else {
					cnt = 0;
				}
				
				totalScore += cnt;
				addedScore = cnt;
			}
			System.out.println(totalScore);
		}
	}

}
