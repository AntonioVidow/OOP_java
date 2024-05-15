package Device_Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    private ArrayList<Device> devices = new ArrayList<>();
    private ArrayList<BrokenDevice> brokenDevices = new ArrayList<>();

    public Service(ArrayList<Device> devices, ArrayList<BrokenDevice> brokenDevices) {
        this.devices = devices;
        this.brokenDevices = brokenDevices;
    }

    public ArrayList<Device> getDevices() {
        return devices;
    }

    public void setDevices(ArrayList<Device> devices) {
        this.devices = devices;
    }

    public ArrayList<BrokenDevice> getBrokenDevices() {
        return brokenDevices;
    }

    public void setBrokenDevices(ArrayList<BrokenDevice> brokenDevices) {
        this.brokenDevices = brokenDevices;
    }

    public void addDevice(Device device){
        devices.add(device);
    }

    public void addBrokenDevice(BrokenDevice broken){
        brokenDevices.add(broken);
    }

    public void moveToBroken(int index, BufferedReader reader) throws IOException {
        Device device = devices.get(index);
        devices.remove(index);
        System.out.println("Input symptom : ");
        String symptoms = reader.readLine();
        System.out.println("Input repair time: ");
        int repairTime = Integer.parseInt(reader.readLine());
        addBrokenDevice(new BrokenDevice(device.getBrand(), device.getModel(), device.getPrice(), symptoms, repairTime));
    }

    public void moveToDevices(int index){
        BrokenDevice broken = brokenDevices.get(index);
        brokenDevices.remove(index);
        addDevice(new Device(broken.getBrand(), broken.getModel(), broken.getPrice()));
    }

    public void printAllWithSymptom(String symptom){
        for(BrokenDevice broken : brokenDevices){
            if(broken.getSymptoms().equals(symptom)){
                System.out.println(broken);
            }
        }
    }

    public double sumAllPrice(){
        double sum = 0;
        for(Device device : devices){
            sum += device.getPrice();
        }
        for(BrokenDevice broken : brokenDevices){
            sum += broken.getPrice();
        }
        return sum;
    }

    public double incomeFromBroken(double repairPricePerDay){
        int daysOfWork = 0;
        for(BrokenDevice broken : brokenDevices){
            daysOfWork += broken.getRepairTime();
        }
        return repairPricePerDay * daysOfWork;
    }

    public void print(){
        for (int i = 0; i < devices.size(); i++) {
            System.out.println(i + devices.get(i).toString());
        }
        System.out.println();
        for (int i = 0; i < brokenDevices.size(); i++) {
            System.out.println(i + brokenDevices.get(i).toString());
        }
    }
    @Override
    public String toString() {
        return "Service{" +
                "devices=" + devices +
                ", brokenDevices=" + brokenDevices +
                '}';
    }
}
