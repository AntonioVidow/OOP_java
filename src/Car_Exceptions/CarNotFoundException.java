package Car_Exceptions;

public class CarNotFoundException extends Exception{
    public CarNotFoundException(String message) {
        super(message);
    }
}
