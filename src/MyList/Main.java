package MyList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<String>();
        myArrayList.add("Something");
        myArrayList.add("like");
        myArrayList.add("a");
        myArrayList.add("String");

        System.out.println(myArrayList.contains("String"));
        System.out.println(myArrayList.get(3));
        System.out.println(myArrayList.size());

    }
}
