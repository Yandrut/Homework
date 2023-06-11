package MyList;

public class MyArrayList<T> implements MyList<T> {
    private T[] myArrayList;
    private int size;

    public MyArrayList() {
        myArrayList = (T[]) new Object[10];
        size = 0;
    }

    @Override
    public void add(T t) {
        if (size == myArrayList.length) {
            T[] tempArray = (T[]) new Object[size + 1];
            for (int i = 0; i < size; i++) {
                tempArray[i] = myArrayList[i];
            }
            myArrayList = tempArray;
        }
        myArrayList[size] = t;
        size++;
    }
    @Override
    public T get(int index) {
        return myArrayList[index];
    }
    @Override
    public int size() {
        return size;
    }
    @Override
    public boolean contains(T toFind) {
        for (T object : myArrayList) {
                if (object.equals(toFind)) {
                    return true;
                }
            }
        return false;
    }
}