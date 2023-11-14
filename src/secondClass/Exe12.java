package secondClass;

import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min  = Integer.MAX_VALUE;
        int sum = 0;
        int average = 0;
        System.out.println("How many numbers do you want to input : ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Input number : ");
            int input = scanner.nextInt();
            if(input > max) max = input;
            if(input < min) min = input;
            sum += input;
        }
        average = sum / n;

        System.out.println("Max : " + max + "\n"+
                "Min : " + min + "\n" +
                "Sum : " + sum + "\n" +
                "Average : " + average);
    }
}
