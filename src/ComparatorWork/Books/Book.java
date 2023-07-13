package ComparatorWork.Books;

import java.util.Comparator;
import java.util.Objects;

public class Book implements Comparable<Book> {
    private final String name;
    private final String author;
    private final int year;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() { return name; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, year);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Book book) {
        return this.getName().compareTo(book.getName());
    }

    static class AuthorComparator implements Comparator <Book> {

        @Override
        public int compare(Book book, Book anotherBook) {
            return book.getAuthor().compareTo(anotherBook.getAuthor());
        }
    }

    static class YearComparator implements Comparator <Book> {

        @Override
        public int compare(Book book, Book anotherBook) {
            return Integer.compare(book.getYear(), anotherBook.getYear());
        }
    }
}
