package Vehicle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input car's brand: ");
        String brand = reader.readLine();
        System.out.println("Input number of passengers: ");
        int passengers = Integer.parseInt(reader.readLine());
        System.out.println("Input HP: ");
        int horsePower = Integer.parseInt(reader.readLine());

        Car c1 = new Car(brand, passengers, horsePower);
        System.out.println(c1.toString() + "\n\n");
        c1.acceleration();
    }
}
