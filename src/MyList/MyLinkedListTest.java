package MyList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyList<String> ints = new MyLinkedList<String>();
        ints.add("0");
        ints.add("1");
        ints.add("2");
        ints.add("3");
        ints.add("4");
        ints.add("5");
        ints.add("6");
        ints.add("1488");
        ints.get(1);
        ints.get(4);
        for (String l : ints) {
            System.out.println(l);
        }
    }
}
