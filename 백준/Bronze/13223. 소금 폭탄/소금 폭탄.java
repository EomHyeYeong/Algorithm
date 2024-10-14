import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String currTime = br.readLine();
        String saltTime = br.readLine();

        if (currTime.equals(saltTime)) {
            System.out.println("24:00:00");
            return;
        }

        int currSec = Integer.parseInt(currTime.substring(6));
        int saltSec = Integer.parseInt(saltTime.substring(6));

        int currMin = Integer.parseInt(currTime.substring(3, 5));
        int saltMin = Integer.parseInt(saltTime.substring(3, 5));

        int currHour = Integer.parseInt(currTime.substring(0, 2));
        int saltHour = Integer.parseInt(saltTime.substring(0, 2));

        int calcSec;
        int calcMin;
        int calcHour;

        if (saltHour < currHour) {
            calcHour = 24 - currHour + saltHour;

            if (saltSec < currSec) {
                calcSec = 60 - currSec + saltSec;
                saltMin -= 1;
            } else {
                calcSec = saltSec - currSec;
            }

            if (saltMin < currMin) {
                calcMin = 60 - currMin + saltMin;
                calcHour -= 1;
            } else {
                calcMin = saltMin - currMin;
            }

        } else {

            if (saltSec < currSec) {
                calcSec = 60 + saltSec - currSec;
                saltMin -= 1;
            } else {
                calcSec = saltSec - currSec;
            }

            if (saltMin < currMin) {
                calcMin = 60 + saltMin - currMin;
                saltHour -= 1;
            } else {
                calcMin = saltMin - currMin;
            }

            calcHour = saltHour - currHour;

        }

        System.out.println(
                intToTime(calcHour) + ":" +
                intToTime(calcMin) + ":" +
                intToTime(calcSec));
    }

    static String intToTime(int time) {
        if (time >= 10)
            return Integer.toString(time);
        return "0" + time;
    }
}
