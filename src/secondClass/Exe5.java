package secondClass;

import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number : ");
        double x = scanner.nextDouble();
        System.out.println("Input number : ");
        double y = scanner.nextDouble();

        if(x > y){
            double z = x;
            x = y;
            y = z;
        }
        System.out.println(" X is : "+ x +  " y is : " + y);
    }
}
