package MyTree;
import java.util.*;
public class MainTree {
    public static void main(String[] args) {
        Trees tree1 = new Trees("Oak", 21);
        Trees tree2 = new Trees("Alder", 10);
        Trees tree3 = new Trees("Apple", 3);
        Trees tree4 = new Trees("Cherry", 2);
        Trees tree5 = new Trees("Palm", 5);
        Trees tree6 = new Trees("Spruce", 11);
        Trees tree7 = new Trees("Maple", 12);
        Trees tree8 = new Trees("Poplar", 21);

        // Tree Set: contains unique elements in sorted way, using comparison. In ascending and descending order
        // null is not allowed
        TreeSet<Trees> treeSet = new TreeSet<>();
        treeSet.add(tree1);
        treeSet.add(tree2);
        treeSet.add(tree3);
        treeSet.add(tree4);
        treeSet.add(tree5);
        treeSet.add(tree6);
        treeSet.add(tree7);
        treeSet.add(tree8);
        treeSet.add(new Trees("TestOak", 21));
//        for (Tree tree : treeSet) {
//            System.out.println(tree);
//        }
        // Hash Set: does not sort elements in order, do not allow duplication.
        HashSet <Trees> hashSet = new HashSet<>();
        hashSet.add(tree1);
        hashSet.add(tree2);
        hashSet.add(tree3);
        hashSet.add(tree4);
        hashSet.add(tree5);
        hashSet.add(tree6);
        hashSet.add(tree7);
        hashSet.add(tree8);
        hashSet.add(new Trees("TestOak", 21));


        // Tree Map: is sorted in ascending way by key, it joins two values: key and object value. Key should be unique value
        TreeMap<Trees, Integer> treeMap = new TreeMap<>();
        treeMap.put(tree1, 12);
        treeMap.put(tree2, 3435);
        treeMap.put(tree3, 324);
        treeMap.put(tree4, 98);
        treeMap.put(tree5, 14);
        treeMap.put(tree6, 2);
        treeMap.put(tree7, 1);
        treeMap.put(tree8, 0);
        treeMap.put(new Trees("TestOak", 21),146);
        //Sorting by average height
        System.out.println(treeMap);

        // Hash Map: does not sort in order, links certain key to a value, doesn't allow key duplicates
        HashMap<Trees, Integer> hashMap = new HashMap<>();
        hashMap.put(tree1, 1);
        hashMap.put(tree2, 21);
        hashMap.put(tree3, 3324);
        hashMap.put(tree4, 523);
        hashMap.put(tree5, 78);
        hashMap.put(tree6, 0);
        hashMap.put(tree7, 76);
        hashMap.put(tree8, 3);
        hashMap.put(new Trees("TestOak", 21),21);
        System.out.println(hashMap);
    }
}
