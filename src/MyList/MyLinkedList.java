package MyList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList <T> implements MyList<T> {

    private static class Node<T> {
        private T currentElement;
        private Node<T> previous;
        private Node<T> next;

        public Node (T element) {
            this.currentElement = element;
        }

        public T getCurrentElement() {
            return currentElement;
        }
    }

    private Node<T> first;
    private Node<T> last;
    private int size;

    public MyLinkedList() {
        this.first = null;
        this.last = null;
        size = 0;
    }

    @Override
    public void add(T t) {
        Node<T> currentNode = new Node<>(t);
            if (this.isEmpty()) {
                first = last = currentNode;
            }
            else if (size >= 1) {
               last.next = currentNode;
               currentNode.previous = last;
               last = currentNode;
            }
        size++;
    }

    @Override
    public T get(int index) {
        checkOutOfBounds(index);

        Node <T> currentNode = first;
        int flag = 0;
        while (currentNode != null) {
            if (flag == index) {
                return currentNode.getCurrentElement();
            }
            currentNode = currentNode.next;
            flag++;
        }
        throw new NoSuchElementException("Element at index " + index + " is not present");
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean contains(Object obj) {
        Node <T> currentNode = first;
        while (currentNode != null) {
            if (obj.equals(currentNode.getCurrentElement())) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    @Override
    public T remove(int index) {
        checkOutOfBounds(index);
        if (this.size() == 1) {
            first = last = null;
        }
        else if (index == 0) {
            first = first.next;
            first.next.previous = null;
        }

        Node <T> currentNode = first;
        Node <T> previousOfCurrent = currentNode.previous;
        Node <T> nextOfCurrent = currentNode.next;
        int flag = 1;

        while (currentNode != null) {
            if (flag == index) {
                previousOfCurrent.next = currentNode.next;
                nextOfCurrent.previous = previousOfCurrent;
            }
            else if (flag == size() -1) {
                previousOfCurrent.next = null;
                last = last.previous;
            }
            currentNode = currentNode.next;
            flag++;
        }
        size--;

        throw new NoSuchElementException("Given element is not present");
    }

    @Override
    public boolean remove(Object obj) {
        if (this.contains(obj)) {
            remove(indexOf(obj));
            return true;
        }
        return false;
    }

    @Override
    public int indexOf(Object o) {
        Node <T> currentNode = first;
        int flag = 0;
        while (currentNode != null) {
            if (o.equals(currentNode.getCurrentElement())) {
                return flag;
            }
            currentNode = currentNode.next;
            flag++;
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return (first == null && last == null);
    }

    @Override
    public T set(int index, T element) {
        checkOutOfBounds(index);
        Node <T> currentNode = first;
        int flag = 0;
        while (currentNode != null) {
            if (flag == index) {
                currentNode.currentElement = element;
                return currentNode.getCurrentElement();
            }
            currentNode = currentNode.next;
            flag++;
        }
        return null;
    }

    @Override
    public boolean addAll(MyList<T> myList) {
        if (myList != null) {
            for (int i = 0; i < myList.size(); i++) {
                this.add(myList.get(i));
            }
            return true;
        }
        return false;
    }

    private void checkOutOfBounds(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<T> {

        @Override
        public boolean hasNext() {
            int index = 0;
            return (index < size());
        }

        @Override
        public T next() {
            return null;
        }
    }
}
