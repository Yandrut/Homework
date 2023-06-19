package MyList;

public class MyArrayListTest {
    public static void mainT() {
        MyArrayList<String> list = new MyArrayList<String>();
        for (int i = 0; i < 1000; i++) {
            list.add("Object" + i);
        }
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }
    }
}