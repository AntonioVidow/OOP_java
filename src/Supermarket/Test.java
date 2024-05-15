package Supermarket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean check = true;
        ArrayList<Manufacturer> manufacturers = new ArrayList<>();
        ArrayList<Product> products = new ArrayList<>();

        String pName = "";
        String mName = "";
        String country = "";
        double price = 0;
        String expireDate = "";

        while (check){
            System.out.println("Exit [y/n] : ");
            String choise = reader.readLine();
            if(choise.equals("y")){
                check = false;
            } else{
                System.out.println("Begin ? [y/n] : ");
                choise = reader.readLine();
                if(choise.equals("y")){
                    System.out.println("Input product name: ");
                    pName = reader.readLine();
                    System.out.println("Input product's price: ");
                    price = Double.parseDouble(reader.readLine());
                    System.out.println("Input expiration date: ");
                    expireDate = reader.readLine();

                    System.out.println("Input manufacturer name: ");
                    mName = reader.readLine();
                    System.out.println("Input manufacturer's country: ");
                    country = reader.readLine();
                    Manufacturer m1 = new Manufacturer(mName, country, products);

                    manufacturers.add(m1);
                    Product p1 = new Product(pName, price, expireDate, m1);
                    products.add(p1);
                    m1.setProducts(products);
                }

                System.out.println("Add product [y/n]: ");
                choise = reader.readLine();
                if(choise.equals("y")){
                    System.out.println("Input product name: ");
                    pName = reader.readLine();
                    System.out.println("Input product's price: ");
                    price = Double.parseDouble(reader.readLine());
                    System.out.println("Input expiration date: ");
                    expireDate = reader.readLine();
                    
                }
            }
        }
    }
}
