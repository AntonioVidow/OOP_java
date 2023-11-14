package secondClass;

import java.util.Scanner;

public class Exe13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;

        double[] arr = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Input number : ");
            double input = scanner.nextDouble();
            arr[i] = input;
        }

        for(double i : arr){
            sum += i;
        }
        System.out.println("The sum is : " + sum);
    }
}
