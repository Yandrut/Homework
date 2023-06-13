package MyList;

public interface MyList <T> {
    void add(T t);
    T get (int index);
    int size();
    boolean contains (Object obj);
    T remove(int index);
    boolean remove(Object o);
    int indexOf(Object o);
    boolean isEmpty();
    T set(int index, T element);
}
