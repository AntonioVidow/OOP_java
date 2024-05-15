package Person_EXE;

public abstract class Person {
    private String name;
    private String egn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEgn() {
        return egn;
    }

    public void setEgn(String egn) {
        this.egn = egn;
    }

    public Person(String name, String egn) {
        this.name = name;
        this.egn = egn;
    }

    public abstract void wordking();
}
