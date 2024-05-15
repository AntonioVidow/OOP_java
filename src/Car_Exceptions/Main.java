package Car_Exceptions;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 15000.0, 2018, "Petrol", "ABC123");
        Car car2 = new Car("Honda", "Civic", 18000.0, 2020, "Diesel", "DEF456");

        Ads ads = new Ads();

        try {
            ads.addCar(car1);
            ads.addCar(car2);
        } catch (DuplicateCarException e) {
            System.out.println(e.getMessage());
        }

        ads.printCars("", "");
        ads.printMostExpensiveCar();

        try {
            ads.deleteCar("ABC123");
        } catch (CarNotFoundException e) {
            System.out.println(e.getMessage());
        }

        ads.printCars("", "");
    }
}
