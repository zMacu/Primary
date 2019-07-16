package models;

public class Magazine extends BaseBook {

    private int releaseFrequencyInDays;

    public Magazine(String name, Double price, int qty, Maker designers, int releaseFrequencyInDays) {
        super(name, price, qty, designers);
        this.releaseFrequencyInDays = releaseFrequencyInDays;
    }

    public Magazine() {
    }

    public int getReleaseFrequencyInDays() {
        return releaseFrequencyInDays;
    }

    public void setReleaseFrequencyInDays(int releaseFrequencyInDays) {
        this.releaseFrequencyInDays = releaseFrequencyInDays;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "releaseFrequencyInDays=" + releaseFrequencyInDays +
                ", name='" + getName() + '\'' +
                ", designers=" + designers +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
