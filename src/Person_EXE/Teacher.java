package Person_EXE;

public class Teacher extends Person{
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher(String name, String egn, String subject) {
        super(name, egn);
        this.subject = subject;
    }
    @Override
    public void wordking() {
        System.out.println("Teaching");
    }
}
