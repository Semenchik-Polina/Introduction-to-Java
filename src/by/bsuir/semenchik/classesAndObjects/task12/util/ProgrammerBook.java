package by.bsuir.semenchik.classesAndObjects.task12.util;

public class ProgrammerBook extends Book {

    private String language;
    private int level;

    public ProgrammerBook() {
    }

    public ProgrammerBook(String title, String author, int price, int isbn, String language, int level) {
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }

    @Override
    public int hashCode() {
        char[] string = (language + level).toCharArray();
        int length = string.length;
        int hash = super.hashCode();
        if (string.length != 0) {
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
        if (!super.equals(obj)) return false;
        else {
            ProgrammerBook prBook = (ProgrammerBook) obj;
            return language.equals(prBook.language) && level == prBook.level;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString());
        builder.append("language").append("=").append(language).append(" ");
        builder.append("level").append("=").append(level).append(" ");
        return builder.toString();
    }
}
