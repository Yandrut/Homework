package CustomDataBase.MyList;
@SuppressWarnings("unused")
public interface MyList <E> extends Iterable <E>{
    void add(E t);
    E get (int index);
    int size();
    boolean contains (Object obj);
    E remove(int index);
    boolean remove(Object o);
    int indexOf(Object o);
    boolean isEmpty();
    E set(int index, E element);
    boolean addAll(MyList<E> myList);
}
