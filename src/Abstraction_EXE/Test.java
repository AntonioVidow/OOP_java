package Abstraction_EXE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Book b1 = new Book(20.00, "15245", "Word of the Rings", "Jhony");
        TV tv1 = new TV(1200.00, "17234", "Samsung", "Shine", 35);

        System.out.println("Input percentage promo for book: ");
        int inputPromo = Integer.parseInt(reader.readLine());
        double promo = inputPromo/100;
        System.out.println("Previous price: " + b1.getPrice());
        System.out.println("New price: " + b1.checkPromo(promo));
    }
}
