package secondClass;

import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. String / 2. Int / 3. Double");
         int choise = scanner.nextInt();


         switch (choise){
             case 1:
                 System.out.println("Input string : ");
                 String strInput = scanner.next();
                 strInput += "*";
                 System.out.println(strInput);
                 break;
             case 2:
                 System.out.println("Input number : ");
                 int input = scanner.nextInt();
                 input += 1;
                 System.out.println(input);
                 break;
             case 3:
                 System.out.println("Input number : ");
                 double dbInput = scanner.nextDouble();
                 dbInput += 1;
                 System.out.println(dbInput);
         }
    }
}
