package secondClass;

import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number : ");
        int a = scanner.nextInt();
        System.out.println("Input number : ");
        int b = scanner.nextInt();
        System.out.println("Input number : ");
        int c = scanner.nextInt();

        System.out.println("Their sum is : " + (a + b + c));
    }
}
