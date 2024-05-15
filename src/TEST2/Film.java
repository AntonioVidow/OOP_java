package TEST2;

import java.io.BufferedReader;
import java.io.IOException;

public class Film {
    private String name;
    private String producent;
    private double budget;
    private String releasYear;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getReleasYear() {
        return releasYear;
    }

    public void setReleasYear(String releasYear) {
        this.releasYear = releasYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Film(String name, String producent, double budget, String releasYear, int id) {
        this.name = name;
        this.producent = producent;
        this.budget = budget;
        this.releasYear = releasYear;
        this.id = id;
    }

    public Film(BufferedReader reader) throws IOException {
        System.out.println("Input name: ");
        this.name = reader.readLine();
        System.out.println("Input producent: ");
        this.producent = reader.readLine();
        System.out.println("Input budget: ");
        this.budget = Double.parseDouble(reader.readLine());
        System.out.println("Input release year: ");
        this.releasYear = reader.readLine();
        System.out.println("Input id: ");
        this.id = Integer.parseInt(reader.readLine());
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", producent='" + producent + '\'' +
                ", budget=" + budget +
                ", releasYear='" + releasYear + '\'' +
                ", id=" + id +
                '}';
    }
}
