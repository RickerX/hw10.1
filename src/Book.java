
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

    public String toString() {
        return "Автор " + this.author + ", название книги: " + this.nameOfTheBook + ", год издания: " + this.theYearOfPublishing;
    }
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book c2 = (Book) other;
        return author.equals(c2.author);
    }
    public int hashCode() {
        return java.util.Objects.hash(author);
    }

}
