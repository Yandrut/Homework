package Wrappers;

import java.util.ArrayList;
import java.util.HashMap;

public class Wrappers {
    static Integer addAllNumbers (ArrayList <Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }
    static ArrayList <Integer> ArrayList () {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        return list;
    }
    static HashMap <String,Double> HashMap () {
        HashMap<String,Double> map = new HashMap<>();
        map.put("Vasiliy", 23.5);
        map.put("Johann",14.1);
        map.put("mono", 1.0);
        map.put("bottle", 14.99);
        return map;
    }
    static Double maxValue (HashMap <String,Double> hashMap) {
        double max = 0;
        for (double value : hashMap.values()) {
            if (value > max) max = value;
        }
        return max;
    }
    public static void main(String[] args) {
         System.out.println("Sum: " + addAllNumbers(ArrayList()));
         System.out.println("Biggest value is: " + maxValue(HashMap()));
    }
}
