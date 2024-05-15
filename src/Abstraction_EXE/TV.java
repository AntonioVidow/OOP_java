package Abstraction_EXE;

public class TV extends Stocks{
    private String manufacturer;
    private String model;
    private int powerKW;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPowerKW() {
        return powerKW;
    }

    public void setPowerKW(int powerKW) {
        this.powerKW = powerKW;
    }

    public TV(double price, String id, String manufacturer, String model, int powerKW) {
        super(price, id);
        this.manufacturer = manufacturer;
        this.model = model;
        this.powerKW = powerKW;
    }

    @Override
    public double checkPromo(double percentPromo) {
        return getPrice() - (getPrice()*percentPromo);
    }

    @Override
    public String toString() {
        return "TV{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", powerKW=" + powerKW+ "KW" + '\'' +
                ", price= " + getPrice() + '\'' +
                '}';
    }
}
