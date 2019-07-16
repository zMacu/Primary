package models;

public class Book extends BaseBook {

    private Maker authors;

    public Book(String name, Double price, int qty, Maker designers, Maker authors) {
        super(name, price, qty, designers);
        this.authors = authors;
    }

    public Book(String name, Double price, int qty) {
        super(name, price, qty);
        this.authors = authors;
    }

    public Book() {
    }

    public Maker getAuthors() {
        return authors;
    }

    public void setAuthors(Maker authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "authors=" + authors +
                ", name='" + name + '\'' +
                ", designers=" + designers +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
