package MyList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<String>();
        list.add("Way");
        list.add("Day");
        list.add("Wife");
        list.add("Knife");

        System.out.println(list.set(3,"May"));
        System.out.println(list.get(3));
    }
}