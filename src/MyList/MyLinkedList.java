package MyList;
import java.util.Iterator;

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
        while (currentNode != null && flag != index) {
            currentNode = currentNode.next;
            flag++;
        }
        return currentNode.getCurrentElement();
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

        T forRemoval = null;
        // Removing the only element if size is 1
        if (this.size() == 1) {
            forRemoval = first.getCurrentElement();
            first = last = null;
        }
        // Removing first element if size is more than 1
        else if (index == 0) {
            forRemoval = first.getCurrentElement();
            first.next.previous = null;
            first = first.next;
        }
        //Removing last element
        else if (index == size() -1) {
            forRemoval = last.getCurrentElement();
            last.previous.next = null;
            last = last.previous;
        } else {
            Node <T> currentNode = first.next;
            Node <T> previousOfCurrent = currentNode.previous;
            Node <T> nextOfCurrent = currentNode.next;
            int flag = 1;

            // Removing at all the other possible scenarios
            while (currentNode != null) {
                if (flag == index) {
                    forRemoval = currentNode.getCurrentElement();
                    previousOfCurrent.next = currentNode.next;
                    nextOfCurrent.previous = previousOfCurrent;
                    currentNode = currentNode.next;
                    flag++;
                    break;
                }
            }
        }
        size--;
        return forRemoval;
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
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<T> {
        private Node <T> currentNode;

        public MyIterator () {
            currentNode = first;
        }

        @Override
        public boolean hasNext() {
            return (currentNode != null);
        }

        @Override
        public T next() {
            T currentElement = currentNode.getCurrentElement();
              currentNode = currentNode.next;
          return currentElement;
        }
    }
}