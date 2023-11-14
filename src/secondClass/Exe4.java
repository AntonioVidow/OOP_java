package secondClass;

import java.util.ArrayList;
import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            System.out.println("Input number : ");
            int a = scanner.nextInt();
            list.add(a);
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) < min){
                min = list.get(i);
            }
            if(list.get(i) > max){
                max = list.get(i);
            }
        }
        System.out.println("The sum of the biggest and smallest number is: " + (max + min));
    }
}
