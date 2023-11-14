package OOP_EXE_1;

public class Course {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course(String cName){
        this.name = cName;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
