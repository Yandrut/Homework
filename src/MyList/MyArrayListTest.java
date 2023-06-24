package MyList;

public class MyArrayListTest {
    public static void main(String [] args) {
        long start = System.nanoTime();

        MyArrayList<String> list = new MyArrayList<String>();
        for (int i = 0; i < 20; i++) {
            list.add("Object" + i);
        }
        long duration = (System.nanoTime() - start)/1000000;
        System.out.println("Duration: " + duration + " ms.");
        for (String s : list) {
            System.out.print(s + " ");
        }
    }
}