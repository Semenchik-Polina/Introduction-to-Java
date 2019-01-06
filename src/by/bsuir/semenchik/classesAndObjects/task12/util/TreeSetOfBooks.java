package by.bsuir.semenchik.classesAndObjects.task12.util;

import by.bsuir.semenchik.classesAndObjects.task12.comparator.AuthorComparator;
import by.bsuir.semenchik.classesAndObjects.task12.comparator.PriceComparator;
import by.bsuir.semenchik.classesAndObjects.task12.comparator.TitleComparator;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetOfBooks {

    public static TreeSet<Book> booksByTitle(TreeSet<Book> books){
        Comparator<Book> titleComparator = new TitleComparator();
        TreeSet<Book> result = new TreeSet<>(titleComparator);
        result.addAll(books);
        return result;
    }

    public static TreeSet<Book> booksByTitleAuthor(TreeSet<Book> books){
        Comparator<Book> comparator = new TitleComparator().thenComparing(new AuthorComparator());
        TreeSet<Book> result = new TreeSet<>(comparator);
        result.addAll(books);
        return result;
    }

    public static TreeSet<Book> booksByAuthorTitle(TreeSet<Book> books){
        Comparator<Book> comparator = new AuthorComparator().thenComparing(new TitleComparator());
        TreeSet<Book> result = new TreeSet<>(comparator);
        result.addAll(books);
        return result;
    }

    public static TreeSet<Book> booksByAuthorTitlePrice(TreeSet<Book> books){
        Comparator<Book> comparator = new AuthorComparator().thenComparing(new TitleComparator())
                .thenComparing(new PriceComparator());
        TreeSet<Book> result = new TreeSet<>(comparator);
        result.addAll(books);
        return result;
    }
}
