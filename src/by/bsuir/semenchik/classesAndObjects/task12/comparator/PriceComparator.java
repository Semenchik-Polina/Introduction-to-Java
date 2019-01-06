package by.bsuir.semenchik.classesAndObjects.task12.comparator;

import by.bsuir.semenchik.classesAndObjects.task12.util.Book;

import java.util.Comparator;

public class PriceComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        int result;

        if (book1.getPrice() > book2.getPrice()) {
            result = 1;
        } else if (book1.getPrice() < book2.getPrice()) {
            result = -1;
        } else {
            result = 0;
        }

        return result;
    }
}

