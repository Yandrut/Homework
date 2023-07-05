package MyList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyList<String> strings = new MyLinkedList<String>();
        strings.add("first");
        strings.add("second");
        strings.add("third");
        strings.add("fourth");
        strings.add("fifth");
        strings.add("sixth");
        strings.add("seventh");
        strings.add("ninth");

        for (String i : strings) {
            System.out.println(strings.remove(i));
            System.out.println(strings.size());
        }
//        for (String i : strings)
//            System.out.println(strings.remove(strings.indexOf(i)));
//        }
    }
}
