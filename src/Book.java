public class Book {
    private String title;
    private int publishDate;
    private Author author;

    public Book(String title, int publishDate, Author author) {
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }

    public Author getAuthor() {
        return author;
    }


    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Книга - " + title + ", год публикации " + publishDate +
                ", " + author;
    }
}