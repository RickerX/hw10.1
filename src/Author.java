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

    public String toString() {
        return this.firtsName +" "+ this.lastName;
    }
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return firtsName.equals(c2.firtsName);
    }
    public int hashCode() {
        return Objects.hash(firtsName);
    }
}
