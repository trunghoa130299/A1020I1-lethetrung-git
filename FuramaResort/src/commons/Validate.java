package commons;

public class Validate {
    public  static  boolean checkEmail(String email) throws Exception{
        String ePattern = "^[a-z\\_\\.\\-]{2,20}\\@[a-z\\_\\-]{2,20}\\.[a-z]{2,9}$";
        if (!email.matches(ePattern)) {
            throw new Exception("Email phải đúng định dạng abc@abc.abc");
        }
        return true;
    }
    public static boolean checkName(String name){
        String nameRegex = "^([A-z\\'\\.-ᶜ]*(\\s))+[A-z\\'\\.-ᶜ]*$";
        return name.matches(nameRegex);
    }
    public static boolean genderException(String gender) throws Exception{
        if (gender =="Male" || gender=="Female" || gender=="Unknown"){
            return true;
        }
        else {
            throw new Exception("Phải nhập male/female/unknown");
        }
    }


}
