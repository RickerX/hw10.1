import java.util.Objects;

public class Author {
    private final String firtsName;
    private final String lastName;
    public  Author(String firstname, String lastname) {
        this.firtsName = firstname;
        this.lastName = lastname;
    }

    public String getFirtsName() {
        return this.firtsName;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return firtsName.equals(author.firtsName) && lastName.equals(author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firtsName, lastName);
    }

    @Override
    public String toString() {
        return firtsName +" "+ lastName;
    }
}
