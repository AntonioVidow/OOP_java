package Device_Service;

public class BrokenDevice extends Device{
    private String symptoms;
    private int repairTime;

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public int getRepairTime() {
        return repairTime;
    }

    public void setRepairTime(int repairTime) {
        this.repairTime = repairTime;
    }

    public BrokenDevice(String brand, String model, double price, String symptoms, int repairTime) {
        super(brand, model, price);
        this.symptoms = symptoms;
        this.repairTime = repairTime;
    }

    @Override
    public String toString() {
        return "BrokenDevice{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", symptoms='" + symptoms + '\'' +
                ", repairTime=" + repairTime +
                '}';
    }
}
