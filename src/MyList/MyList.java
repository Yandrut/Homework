package MyList;

public interface MyList <T> {
    void add(T t);
    T get (int index);
    int size();
    boolean contains (T obj);
}
