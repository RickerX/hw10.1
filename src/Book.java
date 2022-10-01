import java.util.Objects;

public class Book {
    private final Author author;
    private final String nameOfTheBook;
    private int theYearOfPublishing;
    public Book (Author author, String nameOfTheBook, int theYearOfPublishing) {
        this.author = author;
        this.nameOfTheBook = nameOfTheBook;
        this.theYearOfPublishing = theYearOfPublishing;
    }

    public Author getAuthor() {
        return this.author;
    }

    public String getNameOfTheBook() {
        return this.nameOfTheBook;
    }

    public int getTheYearOfPublishing() {
        return this.theYearOfPublishing;
    }

    public void setTheYearOfPublishing(int theYearOfPublishing) {
        this.theYearOfPublishing = theYearOfPublishing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return theYearOfPublishing == book.theYearOfPublishing && Objects.equals(author, book.author) && Objects.equals(nameOfTheBook, book.nameOfTheBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, nameOfTheBook, theYearOfPublishing);
    }

    @Override
    public String toString() {
        return author +" "+nameOfTheBook+" "+theYearOfPublishing;
    }
}
