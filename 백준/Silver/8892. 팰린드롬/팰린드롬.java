import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		for(int i = 0; i < repeat; i++) {
			int cnt = sc.nextInt();
			String[] words = new String[cnt];
			
			for(int j = 0; j < cnt; j++) {
				words[j] = sc.next();
			}
			boolean isIt = false;
			for(int j = 0; j < cnt; j++) {
				for (int k = j+1; k < cnt; k++) {
					String newWord1 = words[j] + words[k];
					String newWord2 = words[k] + words[j];
					int len = newWord1.length();
					int mid = len / 2;
					
					StringBuffer rb1 = new StringBuffer(newWord1.substring(len-(mid+1)));
					StringBuffer rb2 = new StringBuffer(newWord2.substring(len-(mid+1)));
					if(newWord1.substring(0, mid+1).equals(rb1.reverse().toString())) {
						System.out.println(newWord1);
						isIt = true;
						break;
					}
					if(newWord2.substring(0, mid+1).endsWith(rb2.reverse().toString())) {
						System.out.println(newWord2);
						isIt = true;
						break;
					}
					
				}
                if(isIt)
					break;
			}
			if (!isIt) {
				System.out.println("0");
			}
			
		}
		sc.close();
	}

}