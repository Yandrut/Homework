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
            T[] tempArray = (T[]) new Object[size + size/3];
            for (int i = 0; i < size(); i++) {
                tempArray[i] = myArrayList[i];
            }
            myArrayList = tempArray;
        }
        myArrayList[size] = t;
        size++;
    }
    @Override
    public T get(int index) {
        if (index < size && index >= 0) {
            return myArrayList[index];
        }
        throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
    }
    @Override
    public int size() {
        return this.size;
    }
    @Override
    public boolean contains(Object toFind) {
            for (int i = 0; i < size; i++) {
                if (myArrayList[i].equals(toFind)) {
                    return true;
                }
            }
        return false;
    }
    @Override
    public T remove(int index) {
        if (index >= size || index < 0) throw new IndexOutOfBoundsException();
        T removedObject = myArrayList[index];

        if (index == size - 1) {
            size--;
        } else {
            for (int i = index; i < size -1; i++) {
                myArrayList[i] = myArrayList[i+1];
            }
            size--;
         }
        return removedObject;
    }
    @Override
    public boolean remove(Object object) {
        if (this.contains(object)) {
            remove(indexOf(object));
            return true;
        }
        return false;
    }
    @Override
    public int indexOf(Object object) {
        for (int i = 0; i < size; i++) {
            if (myArrayList[i].equals(object)) {
                return i;
            }
        }
        return -1;
    }
    @Override
    public boolean isEmpty() {
        return (size == 0);
    }
    @Override
    public T set(int index, T element) {
        if (index < 0 || index > size-1) throw new IndexOutOfBoundsException();
        myArrayList[index] = element;

        return element;
    }
}