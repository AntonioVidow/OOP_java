package secondClass;

import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number : ");
        int x = scanner.nextInt();
        System.out.println("Input number : ");
        int y = scanner.nextInt();
        System.out.println("Input number : ");
        int z = scanner.nextInt();
        System.out.println("Input number : ");
        int k = scanner.nextInt();
        System.out.println("Input number : ");
        int p = scanner.nextInt();

        int sum = x + y + z + k + p;
        System.out.println("Their sum is : " + sum);
    }
}
