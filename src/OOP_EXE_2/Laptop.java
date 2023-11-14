package OOP_EXE_2;

public class Laptop extends Processor{
    private int RAM;
    private int HDD;

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getHDD() {
        return HDD;
    }

    public void setHDD(int HDD) {
        this.HDD = HDD;
    }

    public Laptop(int hz, String name, int RAM, int HDD) {
        super(hz, name);
        this.RAM = RAM;
        this.HDD = HDD;
    }

    public boolean isBetter(Laptop laptop){
        if(this.RAM > laptop.getRAM() && this.HDD > laptop.getHDD()){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.RAM + " " + this.HDD + " " + super.toString();
    }
}
