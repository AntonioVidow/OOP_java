package OOP_EXE_1;

import java.util.ArrayList;

public class Teacher extends OOP_EXE_1.Person{
    private ArrayList<Course> list;

    public ArrayList<Course> getList() {
        return list;
    }

    public void setList(ArrayList<Course> list) {
        this.list = list;
    }

    public Teacher(String n, int e, ArrayList<Course> list) {
        super(n, e);
        this.list = list;
    }
    @Override
    public String toString() {
        return super.toString() + " -> " + list;
    }
}
