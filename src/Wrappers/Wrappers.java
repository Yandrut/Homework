package Wrappers;

import java.util.ArrayList;
import java.util.HashMap;

public class Wrappers {
    public static Integer addAllNumbers (ArrayList <Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }
    public static Double maxValue (HashMap <String,Double> hashMap) {
        double recentMaxValue = Double.MIN_VALUE;
        for (double value : hashMap.values()) {
            if (value > recentMaxValue) recentMaxValue = value;
        }
        return recentMaxValue;
    }
    public static void main(String[] args) {
        HashMap<String,Double> map = new HashMap<>();
        map.put("Vasiliy", 0.0);
        map.put("Johann",-1.0);
        map.put("mono", 1.0);
        map.put("bottle", -2.1);

        System.out.println("Biggest value is: " + maxValue(map));

        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        System.out.println("Sum of all numbers in the list: " + addAllNumbers(list));
    }
}
