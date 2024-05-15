package Abstraction_EXE;

public abstract class Stocks {
    private double price;
    private String id;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Stocks(double price, String id) {
        this.price = price;
        this.id = id;
    }

    public abstract double checkPromo(double percentPromo);
}
