package Test4;

public class Electronics extends Product{
    private String manufacturer;
    private String model;

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

    public Electronics(String inventoryNumber, double price, int quantity, Provider provider, String manufacturer, String model) throws WrongPhoneNumberException {
        super(inventoryNumber, price, quantity, provider);
        this.manufacturer = manufacturer;
        this.model = model;
    }

    @Override
    public double getPromotionalPrice() {
        return getPrice()*0.9;
    }
}
