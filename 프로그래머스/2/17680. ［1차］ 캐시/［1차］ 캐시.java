import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize==0) return cities.length * 5;

        HashMap<String, Integer> caches = new HashMap<>(cacheSize);
        for (int i = 0; i < cacheSize; i++) caches.put(String.valueOf(i), 0);
        int runtime = 0;

        for (String city : cities) {
            city = city.toLowerCase();

            if (caches.containsKey(city)) {
                caches.replace(city, 0);
                runtime++;
            } else {
                String oldCityName = findLongUsageTimeCityName(caches);
                caches.remove(oldCityName);
                caches.put(city, 0);
                runtime += 5;
            }

            for (String cityName : caches.keySet()) {
                if (cityName.equals(city)) continue;
                int usageTime = caches.get(cityName);
                caches.replace(cityName, usageTime+1);
            }
        }

        return runtime;
    }
    
    String findLongUsageTimeCityName(HashMap<String, Integer> caches) {
        int max = -1;
        String name = "";
        for (String cityName : caches.keySet()) {
            if (max < caches.get(cityName)) {
                max = caches.get(cityName);
                name = cityName;
            }
        }
        return name;
    }
}