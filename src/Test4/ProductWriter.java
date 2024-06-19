package Test4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class ProductWriter {
    public static void saveInFile(Product[] products, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Product product : products) {
                if (product instanceof Electronics) {
                    writer.write("1#" + ((Electronics) product).getProvider().getName() + "#" +
                            ((Electronics) product).getProvider().getPhoneNumber() + "#" + product.getInventoryNumber() +
                            "#" + product.getPromotionalPrice() + "#" + ((Electronics) product).getManufacturer() +
                            "#" + ((Electronics) product).getModel());
                } else if (product instanceof Book) {
                    writer.write("2#" + ((Book) product).getAuthor() + "#" + product.getInventoryNumber() +
                            "#" + product.getPromotionalPrice() + "#" + ((Book) product).getAuthor() +
                            "#" + ((Book) product).getTitle());
                }
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
    }
}
