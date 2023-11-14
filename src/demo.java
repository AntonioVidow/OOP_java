
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello this demo will create your portfolio");
        String[] profile = new String[5];

        System.out.println("What is your name?");
        String name = scanner.nextLine();
        profile[0] = name;

        System.out.println("What is your age");
        String age = scanner.nextLine();
        profile[1] = age;

        System.out.println("Where do you live");
        String country = scanner.nextLine();
        profile[2] = country;

        System.out.println("In which city do you live?");
        String city = scanner.nextLine();
        profile[3] = city;

        System.out.println("What do you do for living");
        String job = scanner.nextLine();
        profile[4] = job;

        for(String next : profile){
            System.out.print(next + " ");
        }
    }
}
