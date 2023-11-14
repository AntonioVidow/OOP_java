package Arrays;

import java.util.Scanner;

public class ChooseJob {

    static void print(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static String[] inputIntoArray(String[] arr, Scanner scanner){
        if(arr[99] != null){
            System.out.println("The list of job offers is full. You can't add new ones.");
        } else{
            System.out.println("Input a job offer to be added to the list : ");
            String input = scanner.nextLine();
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] != null){
                    count++;
                }
            }
            arr[count + 1] = input;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] jobs = new String[100];



            System.out.println("What do you want to do 1. Display all jobs offer. / 2. Add e new job offer./ 3 Stop");
            int choise = scanner.nextInt();
            if(choise == 1){
                print(jobs);
            } else if(choise == 2){
                jobs = inputIntoArray(jobs, scanner);
            } else{
                System.out.println("Error there is no such option!");
            }

    }
}
