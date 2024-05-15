package Supermarket;

import java.util.ArrayList;

public class Manufacturer {
    private String name;
    private String country;

    private ArrayList<Product> products;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public Manufacturer(String name, String country, ArrayList<Product> products) {
        this.name = name;
        this.country = country;
        this.products = products;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", products=" + products +
                '}';
    }
}
