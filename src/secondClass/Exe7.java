package secondClass;

import java.util.Scanner;

public class Exe7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number : ");
        double x = scanner.nextDouble();
        System.out.println("Input number : ");
        double y = scanner.nextDouble();
        System.out.println("Input number : ");
        double z = scanner.nextDouble();

        if(x > y && x > z){
            if(y > z){
                System.out.println(x + " " + y + " " + z);
            } else if(y < z){
                System.out.println(x + " " + z + " " + y);
            }
        } else if(y > x && y > z){
            if(x > z){
                System.out.println(y + " " + x + " " + z);
            } else if(x < z){
                System.out.println(y + " " + z + " " + x);
            }
        } else if(z > x && z > y){
            if(x > y){
                System.out.println(z + " " + x + " " + y);
            } else if(x < y){
                System.out.println(z + " " + y + " " +x);
            }
        }
    }
}
