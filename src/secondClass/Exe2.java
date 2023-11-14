package secondClass;

import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number : ");
        int a = scanner.nextInt();
        System.out.println("Input number : ");
        int b = scanner.nextInt();

        String output = (a>b)?" " + a +" is greater than " +  b : b + " is greater than " + a;
        System.out.println(output);
    }
}
