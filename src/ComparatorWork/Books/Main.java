package ComparatorWork.Books;
import java.util.TreeSet;
import java.util.Set;
public class Main {

    public static <E> void iterate(Set<E> set) {
        for (E element : set) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Set <Book> bookSet = new TreeSet<>();
        bookSet.add(new Book("1984", "G.Orwell", 1948));
        bookSet.add(new Book("Faust", "Y.Goethe", 1774));
        bookSet.add(new Book("Rise and Fall of Third Reich", "W.Shyrer", 2011));
        bookSet.add(new Book("Кобзар", "Т.Шевченко", 1840));
        bookSet.add(new Book("Енеїда", "І.Котляревський", 1798));
        bookSet.add(new Book("Animal Farm", "G.Orwell", 1945));

        System.out.println("Default comparable by Title:");
        iterate(bookSet);

        Set <Book> bookSetSortedByYear = new TreeSet<>(new Book.YearComparator());
        bookSetSortedByYear.addAll(bookSet);
        System.out.println();
        System.out.println("Sorted by Year:");
        iterate(bookSetSortedByYear);

        Set<Book> bookSetSortedByAuthor = new TreeSet<>(new Book.AuthorComparator());
        bookSetSortedByAuthor.addAll(bookSet);
        System.out.println();
        System.out.println("Sorted by Author:");
        iterate(bookSetSortedByAuthor);
    }
}
