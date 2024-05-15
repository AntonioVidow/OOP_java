package Vehicle;

public class Car extends Vehicle{
    private int horsePower;

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public Car(String brand, int numberOfPassengers, int horsePower) throws ArithmeticException{
        super(brand, numberOfPassengers);
        if(horsePower < 0 ){
            throw new ArithmeticException("Horsepower cannot be negative!");
        } else{
            this.horsePower = horsePower;
        }
    }


    @Override
    public void acceleration() {
        System.out.println("The car goes brrrrrrr");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + getBrand() +
                "numberOfPassengers=" + getBrand() +
                "horsePower=" + horsePower +
                '}';
    }
}
