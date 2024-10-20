import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] castleSize = br.readLine().split(" ");
        int n = Integer.parseInt(castleSize[0]);
        int m = Integer.parseInt(castleSize[1]);
        boolean[] nBouncerExist = new boolean[n];
        boolean[] mBouncerExist = new boolean[m];

        for (int i = 0; i < n; i++) {
            String castleFloor = br.readLine();
            for (int j = 0; j < castleFloor.length(); j++) {
                char curr = castleFloor.charAt(j);
                if (curr == 'X') {
                    nBouncerExist[i] = true;
                    mBouncerExist[j] = true;
                }
            }
        }

        int nCount = 0;
        for (int i = 0; i < n; i++) {
            if (!nBouncerExist[i])
                nCount++;
        }

        int mCount = 0;
        for (int i = 0; i < m; i++) {
            if (!mBouncerExist[i])
                mCount++;
        }

        System.out.println(Math.max(nCount, mCount));
    }
}