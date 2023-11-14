package OOP_EXE_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input MHz for the CPU :");
        int MHz = Integer.parseInt(reader.readLine());
        System.out.println("Input CPU name : ");
        String nameCPU = reader.readLine();
        System.out.println("Input laptop RAM : ");
        int RAM = Integer.parseInt(reader.readLine());
        System.out.println("Input laptop HDD : ");
        int HDD = Integer.parseInt(reader.readLine());
        Laptop l1 = new Laptop(MHz,nameCPU, RAM , HDD);

        System.out.println(l1.toString());

        System.out.println("\nInput Laptop for comparison \nInput MHz for the CPU :");
        MHz = Integer.parseInt(reader.readLine());
        System.out.println("Input CPU name : ");
        nameCPU = reader.readLine();
        System.out.println("Input laptop RAM : ");
        RAM = Integer.parseInt(reader.readLine());
        System.out.println("Input laptop HDD : ");
        HDD = Integer.parseInt(reader.readLine());
        Laptop l2 = new Laptop(MHz, nameCPU, RAM, HDD);

        if(l1.isBetter(l2)){
            System.out.println(l1.toString() + " is better than " + l2.toString());
        }
        else{
            System.out.println(l1.toString() + " is worse than " + l2.toString());
        }
    }
}
