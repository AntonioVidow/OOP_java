package OOP_EXE_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input teacher's name : ");
        String name = reader.readLine();
        System.out.println("Input teacher's age : ");
        int age = Integer.parseInt(reader.readLine());
        System.out.println("How many courses does the teacher have : ");
        int n = Integer.parseInt(reader.readLine());
        ArrayList<Course> list = new ArrayList<Course>();
        String cName = "";
        for (int i = 0; i < n; i++) {
            System.out.println("Input the course name : ");
            cName = reader.readLine();
            list.add(new Course(cName));
        }

        Teacher t1 = new Teacher(name, age, list);
        System.out.println(t1.toString());
    }
}
