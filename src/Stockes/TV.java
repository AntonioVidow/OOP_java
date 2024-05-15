package Stockes;

public class TV extends Stock{
    private String manufacturer;
    private String model;
    private double wats;

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

    public double getWats() {
        return wats;
    }

    public void setWats(double wats) {
        this.wats = wats;
    }

    public TV(int id, double price, String manufacturer, String model, double wats) {
        super(id, price);
        this.manufacturer = manufacturer;
        this.model = model;
        this.wats = wats;
    }

    @Override
    public double checkPromo(double  promo) {
        return getPrice() - (getPrice() * (promo/100));
    }
}
