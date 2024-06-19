package Test4;

public interface ValidatePhone {
    static boolean validatePhoneNumber(String phoneNumber) throws WrongPhoneNumberException{
        char[] phone = phoneNumber.toCharArray();
        if(phoneNumber.length() < 10){
            throw new WrongPhoneNumberException("Phone number mustn't be less than 10");
        }else{
            for (int i = 0; i < phoneNumber.length(); i++) {
                if(!Character.isDigit(phone[i])){
                    throw new WrongPhoneNumberException("Phone number must be only numbers!");
                }
            }
        }
        return true;
    }
}
