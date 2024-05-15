package Person_EXE;

public class Student extends Person{
    private String facNum;

    public String getFacNum() {
        return facNum;
    }

    public void setFacNum(String facNum) {
        this.facNum = facNum;
    }

    public Student(String name, String egn, String facNum) {
        super(name, egn);
        this.facNum = facNum;
    }

    @Override
    public void wordking() {
        System.out.println("Studying");
    }
}
