package TEST2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Film[] films = new Film[5];
        Film f1 = new Film("Word of the Rings", "Mike", 1500000, "01.05.2003", 1);
        films[0] = f1;

        Film f2 = new Film(reader);
        films[1] = f2;

        Film f3 = new Film("Need for Speed", "Mike", 1300000, "01.05.2003", 3);
        films[2] = f3;

        Films list = new Films(films);
        System.out.println();
        list.print();

        Film f4 = new Film("Fast and Furious", "John", 1150000, "01.05.2003", 4);
        list.addFilm(f4);
        System.out.println("\n");
        list.print();

        System.out.println("\n");
        list.filterByProducer("Mike");

        System.out.println("\n");
        list.biggestBudget();

        System.out.println("\n" +
                "Average Mike");
        System.out.println(list.avgBudget("Mike"));

        System.out.println("\n" +
                "Average all");
        System.out.println(list.avgBudget(""));
    }
}
