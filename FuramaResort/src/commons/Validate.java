package commons;

public class Validate {
    public  static  boolean checkEmail(String email){
        String ePattern = "^[a-z\\_\\.\\-]{2,20}\\@[a-z\\_\\-]{2,20}\\.[a-z]{2,9}$";
        return email.matches(ePattern);
    }
    public static boolean checkName(String name){
        String nameRegex = "^([A-z\\'\\.-ᶜ]*(\\s))+[A-z\\'\\.-ᶜ]*$";
        return name.matches(nameRegex);
    }
}
