package Test3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Buyable[] buyableArray = new Buyable[2];
        buyableArray[0] = new Product(234,"Mercedes",3);
        buyableArray[1] = new BetterProduct(234,"BMW",3);
        for (int i = 0; i < buyableArray.length; i++) {
            System.out.println(buyableArray[i].getName());
        }

        boolean flag = true;

        while(flag){
            System.out.println("Main Menu:");
            System.out.println("1. Add a new product");
            System.out.println("2. Search by name");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(reader.readLine());

            switch (choice){
                case 1:
                    System.out.println("Enter product id : ");
                    int id = Integer.parseInt(reader.readLine());
                    System.out.println("Enter name : ");
                    String name = reader.readLine();
                    System.out.println("Enter quantity : ");
                    int quantity = Integer.parseInt(reader.readLine());
                    buyableArray = addProduct(buyableArray, new Product(id, name, quantity));
                    System.out.println("\n");
                    for (int i = 0; i < buyableArray.length; i++) {
                        System.out.println(buyableArray[i].getName());
                    }
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("Enter name to searcch by : ");
                    String searchName = reader.readLine();
                    searchProductByName(buyableArray, searchName);
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid input. Try again!");
            }
            System.out.println("\n");
        }
    }

    private static Buyable[] addProduct(Buyable[] array, Buyable product) {
        Buyable[] newArray = new Buyable[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = product;
        return newArray;
    }

    private static void searchProductByName(Buyable[] products, String name) {
        boolean found = false;
        for (Buyable product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                System.out.println("Product found:");
                System.out.println("Name: " + product.getName());
                System.out.println("ID: " + ((Product) product).getId());
                System.out.println("Quantity: " + ((Product) product).getQuantity());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product with name " + name + " was not found.");
        }
    }
}
