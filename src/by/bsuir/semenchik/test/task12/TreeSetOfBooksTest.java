package by.bsuir.semenchik.test.task12;

import by.bsuir.semenchik.classesAndObjects.task12.util.Book;
import by.bsuir.semenchik.classesAndObjects.task12.util.TreeSetOfBooks;
import junit.framework.TestCase;

import java.util.TreeSet;

public class TreeSetOfBooksTest extends TestCase {

    private TreeSet<Book> generate(){
        Book book1 = new Book("first", "Richard", 13,1);
        Book book2 = new Book("second", "Janie", 12,3);
        Book book3 = new Book("third", "Richard", 11,2);

        TreeSet<Book> bookTreeSet = new TreeSet<>();

        bookTreeSet.add(book1);
        bookTreeSet.add(book2);
        bookTreeSet.add(book3);
        return bookTreeSet;
    }

    public void testBooksByTitle() {
        TreeSet<Book> books = generate();
        TreeSet<Book> actual = TreeSetOfBooks.booksByTitle(books);
    }

    public void testBooksByTitleAuthor() {
    }

    public void testBooksByAuthorTitle() {
    }

    public void testBooksByAuthorTitlePrice() {
    }
}