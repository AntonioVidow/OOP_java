package Exceptions_EXE;

public class House extends Building{
    private int floors;
    private String owner;

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public House(int height, double area, String address, int floors, String owner) throws BuildingException, HouseException {
        super(height, area, address);
        if(floors <=0 || owner.isEmpty()){
            throw new HouseException("Invalid input");
        }
        this.floors = floors;
        this.owner = owner;
    }

    public static House mostBig(House[] arr){
        House biggest = arr[0];
        double temp = (double) arr[0].getHeight() / arr[0].getFloors();
        for (int i = 1; i < arr.length; i++) {
            double sum = (double) arr[i].getHeight() / arr[i].getFloors();
            if(temp < sum){
                biggest = arr[i];
            }
        }
        return biggest;
    }


    @Override
    public String toString() {
        return "House{" +
                "height=" + getHeight() +
                ", area=" + getArea() +
                ", address='" + getAddress() +
                ", floors=" + floors +
                ", owner='" + owner + '\'' +
                '}';
    }
}
