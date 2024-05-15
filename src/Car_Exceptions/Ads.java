package Car_Exceptions;

import java.util.ArrayList;

public class Ads {
    private ArrayList<Car> cars;

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public Ads() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) throws DuplicateCarException {
        for (Car existingCar : cars) {
            if (existingCar.getEngineSerialNumber().equals(car.getEngineSerialNumber())) {
                throw new DuplicateCarException("Car with engine serial number " + car.getEngineSerialNumber() + " already exists.");
            }
        }
        cars.add(car);
    }

    public void deleteCar(String engineSerialNumber) throws CarNotFoundException {
        boolean removed = false;
        for (Car car : cars) {
            if (car.getEngineSerialNumber().equals(engineSerialNumber)) {
                cars.remove(car);
                removed = true;
                break;
            }
        }
        if (!removed) {
            throw new CarNotFoundException("Car with engine serial number " + engineSerialNumber + " not found.");
        }
    }

    public void printCars(String brand, String model) {
        for (Car car : cars) {
            if (brand.isEmpty() || car.getBrand().equalsIgnoreCase(brand)) {
                if (model.isEmpty() || car.getModel().equalsIgnoreCase(model)) {
                    System.out.println("Brand: " + car.getBrand() +
                            ", Model: " + car.getModel() +
                            ", Price: $" + car.getPrice() +
                            ", Year: " + car.getYear() +
                            ", Fuel Type: " + car.getFuelType() +
                            ", Engine Serial Number: " + car.getEngineSerialNumber());
                }
            }
        }
    }

    public void printMostExpensiveCar() {
        if (cars.isEmpty()) {
            System.out.println("No cars available.");
            return;
        }

        Car mostExpensiveCar = cars.get(0);
        for (Car car : cars) {
            if (car.getPrice() > mostExpensiveCar.getPrice()) {
                mostExpensiveCar = car;
            }
        }

        System.out.println("Most expensive car:");
        System.out.println("Brand: " + mostExpensiveCar.getBrand() +
                ", Model: " + mostExpensiveCar.getModel() +
                ", Price: $" + mostExpensiveCar.getPrice() +
                ", Year: " + mostExpensiveCar.getYear() +
                ", Fuel Type: " + mostExpensiveCar.getFuelType() +
                ", Engine Serial Number: " + mostExpensiveCar.getEngineSerialNumber());
    }
}
