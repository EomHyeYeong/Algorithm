import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] position = br.readLine().split(" ");
        String[] direction = br.readLine().split(" ");
        int w = Integer.parseInt(position[0]);
        int h = Integer.parseInt(position[1]);
        int p = Integer.parseInt(direction[0]);
        int q = Integer.parseInt(direction[1]);
        int t = Integer.parseInt(br.readLine());

        int timeX = t % (2 * w);
        int currentX = p;
        int deltaX = 1;
        while (timeX-- > 0) {
            if (currentX == w) deltaX = -1;
            else if (currentX == 0) deltaX = 1;
            currentX += deltaX;
        }

        int timeY = t % (2 * h);
        int currentY = q;
        int deltaY = 1;
        while (timeY-- > 0) {
            if (currentY == h) deltaY = -1;
            else if (currentY == 0) deltaY = 1;
            currentY += deltaY;
        }

        System.out.println(currentX + " " + currentY);
    }
}