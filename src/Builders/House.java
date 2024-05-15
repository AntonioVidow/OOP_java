package Builders;

public class House extends Building{
    private int storages;
    private String owner;
    private String telNumber;

    public int getStorages() {
        return storages;
    }

    public void setStorages(int storages) {
        this.storages = storages;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public House(int height, double area, String address, int storages, String owner, String telNumber) {
        super(height, area, address);
        this.storages = storages;
        this.owner = owner;
        this.telNumber = telNumber;
    }

    @Override
    public String toString() {
        return "House { Height: "+ getHeight() + " Area: " + getArea() + " Floors: " + storages +
                " Address: " + getAddress() + " Owner: " + owner + ": " + telNumber + " } ";
    }
}
