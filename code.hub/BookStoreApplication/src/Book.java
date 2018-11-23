public class Book {
    private String title;
    private String authorName; //camelcase names
    private float eurosPrice;

    public Book(String title, String authorName, float eurosPrice) {
        this.title = title;
        this.authorName = authorName;
        this.eurosPrice = eurosPrice;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public float getEurosPrice() {
        return eurosPrice;
    }

    public void setEurosPrice(float eurosPrice) {
        this.eurosPrice = eurosPrice;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", eurosPrice=" + eurosPrice +
                '}';
    }
}
