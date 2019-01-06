package by.bsuir.semenchik.classesAndObjects.task12.util;

public class Book implements Cloneable, Comparable<Book> {

    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public Book() {
    }

    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
    //    edition = edit;
        this.isbn = isbn;
    }

    @Override
    public int hashCode() {
        char[] string = (title + author + price + edition).toCharArray();
        int length = string.length;
        int hash = 11;
        if (string.length != 0){
            for (int i = 0; i < length; i++) {
                hash = hash * 3 + (int) (string[i]);
            }
        }

        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        if (this == obj) return true;
        Book b = (Book) obj;
        if ((b.title == null && title == null)||(b.author == null && author == null)){
            return true;
        }
        if (b.author ==null ||b.title==null||author == null|| title == null) {
            return false;
        }
        return title.equals(b.title)&&author.equals(b.author)&& price == b.price;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(getClass().getName()).append("@");
        builder.append("title").append("=").append(title).append(" ");
        builder.append("author").append("=").append(author).append(" ");
        builder.append("price").append("=").append(price).append(" ");
        builder.append("edition").append("=").append(edition).append(" ");
        return builder.toString();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Book obj = null;
        obj = (Book) super.clone();
        //obj = new Book(title, author, price, isbn);
        return obj;
    }

    @Override
    public int compareTo(Book anotherBook) {
        int anotherBookIsbn = anotherBook.isbn;
        return this.isbn - anotherBookIsbn;
    }
}
