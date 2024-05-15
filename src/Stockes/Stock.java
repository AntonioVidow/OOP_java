package Stockes;

public abstract class Stock {
    private int id;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Stock(int id, double price) {
        this.id = id;
        this.price = price;
    }
    public abstract double checkPromo(double promo);
}
