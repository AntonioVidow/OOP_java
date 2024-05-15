package Builders;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        House[] arr = new House[4];
        int height;
        double area;
        String address;
        int storages;
        String owner;
        String tellNUm;

        for (int i = 0; i < 4; i++) {
            System.out.println("Input building height: ");
            height = Integer.parseInt(reader.readLine());
            System.out.println("Input building area: ");
            area = Double.parseDouble(reader.readLine());
            System.out.println("Input building address: ");
            address = reader.readLine();
            System.out.println("Input building storages: ");
            storages = Integer.parseInt(reader.readLine());
            System.out.println("Input building owner: ");
            owner = reader.readLine();
            System.out.println("Input building owners telephone number: ");
            tellNUm = reader.readLine();
            House h = new House(height, area, address, storages, owner,tellNUm);
            arr[i] = h;
        }

        House biggest = biggestHouse(arr);
        System.out.println(biggest);

    }

    public static House biggestHouse(House[] arr){
        House biggest = arr[0];
        int avrHeight = arr[0].getHeight()/arr[0].getStorages();
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i].getHeight()/arr[i].getStorages();
            if(temp>avrHeight){
                biggest = arr[i];
            }
        }
        return biggest;
    }
}