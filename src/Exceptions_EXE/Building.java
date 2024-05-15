package Exceptions_EXE;

public class Building {
    private int height;
    private double area;
    private String address;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Building(int height, double area, String address) throws BuildingException{
        if(height <= 0 || area <=0 || address.isEmpty()){
            throw new BuildingException("False input!!");
        }
        this.height = height;
        this.area = area;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Building{" +
                "height=" + height +
                ", area=" + area +
                ", address='" + address + '\'' +
                '}';
    }
}
