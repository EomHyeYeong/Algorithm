import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strOrigin = br.readLine();
        String strCompare = br.readLine();
        int wordCnt = 0;

        for (int i = 0; i < strOrigin.length(); i++) {
            if (strOrigin.substring(i).length() < strCompare.length()) {
                break;
            }

            if (strOrigin.substring(i, i+strCompare.length()).equals(strCompare)) {
                wordCnt += 1;
                i = i + strCompare.length()-1;
            }
        }
        System.out.println(wordCnt);
    }
}
