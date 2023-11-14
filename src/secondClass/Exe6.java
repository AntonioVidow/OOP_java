package secondClass;

import java.util.Scanner;

public class Exe6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number : ");
        int x = scanner.nextInt();
        System.out.println("Input number : ");
        int y = scanner.nextInt();
        System.out.println("Input number : ");
        int z = scanner.nextInt();

        if(x > y && x > z){
            System.out.println("The biggest number is " + x);
        } else if(y >x && y > z){
            System.out.println("The biggest number is " + y);
        }  else if(z >x && z > y ){
            System.out.println("The biggest number is " +z);
        }
    }
}
