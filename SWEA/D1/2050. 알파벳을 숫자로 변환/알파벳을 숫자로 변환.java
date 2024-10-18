import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toUpperCase();
        for (int i = 0; i < input.length(); i++) {
        	char alphabet = input.charAt(i);
            System.out.printf("%d ", alphabet - 'A' + 1);
        }
	}
}