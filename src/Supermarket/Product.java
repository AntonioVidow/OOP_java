package Supermarket;

import java.util.ArrayList;

public class Product {
    private String name;
    private double price;
    private String expireDate;

    private Manufacturer manufacturer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Product(String name, double price, String expireDate, Manufacturer manufacturer) {
        this.name = name;
        this.price = price;
        this.expireDate = expireDate;
        this.manufacturer = manufacturer;
    }
}
