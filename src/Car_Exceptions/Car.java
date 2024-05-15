package Car_Exceptions;

public class Car {
    private String brand;
    private String model;
    private double price;
    private int year;
    private String fuelType;
    private String engineSerialNumber;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getEngineSerialNumber() {
        return engineSerialNumber;
    }

    public void setEngineSerialNumber(String engineSerialNumber) {
        this.engineSerialNumber = engineSerialNumber;
    }

    public Car(String brand, String model, double price, int year, String fuelType, String engineSerialNumber) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.year = year;
        this.fuelType = fuelType;
        this.engineSerialNumber = engineSerialNumber;
    }
}
