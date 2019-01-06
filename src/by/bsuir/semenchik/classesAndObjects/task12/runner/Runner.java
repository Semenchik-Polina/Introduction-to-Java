package by.bsuir.semenchik.classesAndObjects.task12.runner;

import by.bsuir.semenchik.classesAndObjects.task12.comparator.TitleComparator;
import by.bsuir.semenchik.classesAndObjects.task12.util.Book;
import by.bsuir.semenchik.classesAndObjects.task12.util.ProgrammerBook;
import by.bsuir.semenchik.classesAndObjects.task12.util.TreeSetOfBooks;

import java.util.*;

public class Runner {
    public static void main(String args[]) {
        Book book1 = new Book("first", "Richard", 13,1);
        Book book2 = new Book("second", "Janie", 12,3);
        Book book3 = new Book("first", "Richard", 11,2);
        Book book4 = new Book("forth", "John", 5,7);


        Object book5 = null;
        try {
            book5 = book1.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Unsupported operation. " + e);
        }

        System.out.println(book1.hashCode());
        System.out.println(book1.toString());
        System.out.println(book1.equals(book2)+", "+ book1.equals(book4)+"\r\n");

        ProgrammerBook prBook1 = new ProgrammerBook("1", "John",12,80,"C++",0);
        ProgrammerBook prBook2 = new ProgrammerBook("2", "John",12,50,"C++",1);

        System.out.println(prBook1.hashCode());
        System.out.println(prBook1.toString());
        System.out.println(prBook1.equals(prBook2)+", "+ prBook1.equals(prBook1));

        TreeSet<Book> bookTreeSet = new TreeSet<>();
        bookTreeSet.add(book1);
        bookTreeSet.add(book2);
        bookTreeSet.add(book3);
        bookTreeSet.add(book4);


        StringBuilder builder = new StringBuilder();
        builder.append("TreeSet:");
        for (Book item: bookTreeSet){
            builder.append(item.getTitle()).append(" ");
        }
        System.out.print("Sorted by isbn: " + builder.toString() + "\r\n");
        //bookTreeSet.clear();


        TreeSet<Book> booksByTitle = TreeSetOfBooks.booksByTitle(bookTreeSet);
        builder = new StringBuilder();
        for (Book item: booksByTitle){
            builder.append(item.getTitle()).append(" ");
        }
        System.out.print("Sorted by title: " + builder.toString() + "\r\n");


        TreeSet<Book> booksByTitleAuthor = TreeSetOfBooks.booksByTitleAuthor(bookTreeSet);
        builder = new StringBuilder();
        for (Book item: booksByTitleAuthor){
            builder.append(item.getTitle()).append(" ");
        }
        System.out.print("Sorted by title, author: " + builder.toString() + "\r\n");


        TreeSet<Book> booksByAuthorTitle = TreeSetOfBooks.booksByAuthorTitle(bookTreeSet);
        builder = new StringBuilder();
        for (Book item: booksByAuthorTitle){
            builder.append(item.getTitle()).append(" ");
        }
        System.out.print("Sorted by author, title: " + builder.toString() + "\r\n");


        TreeSet<Book> booksByTitleAuthorPrice = TreeSetOfBooks.booksByAuthorTitlePrice(bookTreeSet);
        builder = new StringBuilder();
        for (Book item: booksByTitleAuthorPrice){
            builder.append(item.getTitle()).append(" ");
        }
        System.out.print("Sorted by title, author, price: " + builder.toString() + "\r\n");
    }
}
