import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        Map<String, Integer> dayMap = setDayMap();

        for (int c = 0; c < testCase; c++) {
            String day = br.readLine();
            System.out.printf("#%d %d\n", c+1, dayMap.get(day));
        }
    }

    static Map<String, Integer> setDayMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("SUN", 7);
        map.put("MON", 6);
        map.put("TUE", 5);
        map.put("WED", 4);
        map.put("THU", 3);
        map.put("FRI", 2);
        map.put("SAT", 1);
        return map;
    }
}