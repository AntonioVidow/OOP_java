package firstCalss;

import java.util.Scanner;

public class exe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {"What is your name?", "What is your age", "In which country do you live?",
        "In which city do you live", "What do you do fot living"};
        System.out.println("Hello this demo will create your portfolio");
        String[] profile = new String[5];

        for (int i = 0; i < profile.length; i++) {
            System.out.println(questions[i]);
            String answer = scanner.nextLine();
            profile[i] = answer;
        }
    }
}
