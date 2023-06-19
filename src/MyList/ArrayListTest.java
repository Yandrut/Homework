package MyList;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String [] args) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add("Object" + i);
        }
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }
    }
}
