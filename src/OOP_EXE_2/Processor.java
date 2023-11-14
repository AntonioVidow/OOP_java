package OOP_EXE_2;

public class Processor {
    private int hz;
    private String name;

    public int getHz() {
        return hz;
    }

    public void setHz(int hz) {
        this.hz = hz;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Processor(int hrz, String name) {
        this.hz = hrz;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " " + this.hz + "MHz";
    }
}
