import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int days;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		
		days = sc.nextInt();
		sc.nextLine();
		String[] plan = sc.nextLine().split(" ");
        String[] real = sc.nextLine().split(" ");
        sc.close();
        
        for(int i = 0; i < days; i++) {
        	int p = Integer.parseInt(plan[i]);
        	int r = Integer.parseInt(real[i]);
        	
        	if(r >= p)
        		cnt++;
        }
        
        System.out.println(cnt);
	}

}