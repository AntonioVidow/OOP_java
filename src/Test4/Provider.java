package Test4;

public class Provider implements ValidatePhone{
    private String name;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws WrongPhoneNumberException {
        if(ValidatePhone.validatePhoneNumber(phoneNumber)){
            this.phoneNumber = phoneNumber;
        }
    }

    public Provider(String name, String phoneNumber) throws WrongPhoneNumberException {
        this.name = name;
        setPhoneNumber(phoneNumber);
    }


}
