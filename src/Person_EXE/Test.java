package Person_EXE;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Antonio", "0641272034", "20305");
        Student s2 = new Student("Deni", "06411542034", "20312");
        Student s3 = new Student("Mitko", "0641210034", "20313");

        Teacher t1 = new Teacher("Yanita", "0852156485", "Geography");
        Teacher t2 = new Teacher("Denica", "0952112485", "BEL");
        Teacher t3 = new Teacher("Tomov", "0741156442", "OOP");

        Person[] arr = new Person[2];
        arr[0] = t1;
        arr[1] = s1;
    }
}
