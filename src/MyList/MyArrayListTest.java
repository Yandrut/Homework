package MyList;

public class MyArrayListTest {
    public static void main(String [] args) {
        long start = System.nanoTime();

        MyArrayList<String> list = new MyArrayList<String>();
        for (int i = 0; i < 1000; i++) {
            list.add("Object" + i);
        }
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }
        long duration = (System.nanoTime() - start)/1000000;
        System.out.println("Duration: " + duration + " ms.");
        for (String s : list) {
            String result = "";
            result += s;
            System.out.println(result);
        }
    }
}