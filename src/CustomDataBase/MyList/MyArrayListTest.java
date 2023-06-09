package CustomDataBase.MyList;

public class MyArrayListTest {
    public static void main(String [] args) {
        long start = System.nanoTime();

        MyList<String> list = new MyArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add("Object" + i);
        }
        long duration = (System.nanoTime() - start)/1000000;

        System.out.println("Duration: " + duration + " ms.");
        System.out.println("Size before: " + list.size());

        MyList<String> al = new MyArrayList<>();
        al.add("One");
        al.add("Two");
        al.add("Three");
        al.add("Four");
        al.add("Five");
        al.add("Six");

        list.addAll(al);
        System.out.println("Size after: " + list.size());

        for (String s : list) {
            System.out.println(s);
        }
    }
}