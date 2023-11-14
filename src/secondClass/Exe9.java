package secondClass;

import java.util.Scanner;

public class Exe9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.println("Input number : ");
            int a = scanner.nextInt();
            if(a > max) max = a;
        }
        System.out.println("The biggest number is " + max);
    }
}
