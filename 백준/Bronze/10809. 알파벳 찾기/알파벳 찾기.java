import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
			if(map.get(c)==null) {
				map.put(c, i);
			}
			
		}
		for (int i = 'a'; i < 'z'+1; i++) {
			Character c = (char)i;
			
			if(map.get(c)==null) {
				System.out.print(-1 + " ");
			}
			else {
				System.out.print(map.get(c) + " ");
			}
		}

	}

}
