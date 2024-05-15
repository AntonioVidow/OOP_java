package Device_Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Device d1 = new Device("Samsung", "A50", 560);
        Device d2 = new Device("Asus", "ROG", 2300);
        Device d3 = new Device("IPhone", "14 Pro Max", 2000);

        ArrayList<Device> devices = new ArrayList<>();
        ArrayList<BrokenDevice> brokenDevices = new ArrayList<>();

        devices.add(d1);
        devices.add(d2);
        devices.add(d3);

        Service service = new Service(devices, brokenDevices);
        service.print();

        System.out.println("Move a device to broken, input index : " );
        int index = Integer.parseInt(reader.readLine());
        service.moveToBroken(index, reader);

        service.print();

        service.printAllWithSymptom("battery");
        System.out.println("Income from broken devices" + service.incomeFromBroken(30));

        System.out.println("Move a device from broken, input index : " );
        index = Integer.parseInt(reader.readLine());
        service.moveToDevices(index);

        service.print();

        System.out.println("Tottal cost of devices: " + service.sumAllPrice());


    }

}
