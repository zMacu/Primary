package models;

public abstract class BaseBook {

    protected String name;
    protected Maker designers;
    protected Double price;
    protected int qty;

    public BaseBook(String name, Double price, int qty, Maker designers) {
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.designers = designers;
    }

    public BaseBook(String name, Double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public BaseBook(String name) {
        this.name = name;
    }

    public BaseBook() {

    }

    public Maker getDesigners() {
        return designers;
    }

    public void setDesigners(Maker designers) {
        this.designers = designers;
    }

    @Override
    public abstract String toString();

    public String getTitle() {
        return "Book";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

}
