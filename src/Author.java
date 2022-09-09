public class Author {

    private String name;
    private String surname;
    private Author id;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "автор - " + name + " " + surname;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return id.equals(c2.id);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id);
    }
}
