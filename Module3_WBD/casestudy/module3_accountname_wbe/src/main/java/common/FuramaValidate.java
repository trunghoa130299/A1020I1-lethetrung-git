package common;

public class FuramaValidate {
    public static String validateSdt(String sdt){
        String regex = "(090|091)[0-9]{7}";
        String msg = null;
        if (sdt.matches(regex)) {
            msg = "ok";
        }
        return  msg;
    }
    public static boolean validateCmnd(String cmnd){
        String regex = "[\\d]{9}";
        if (cmnd.matches(regex)){
            return true;
        }return false;
    }
    public  static  boolean validateEmail(String email) throws Exception{
        String ePattern = "^[a-z\\_\\.\\-]{2,20}\\@[a-z\\_\\-]{2,20}\\.[a-z]{2,9}$";
        if (!email.matches(ePattern)) {
            throw new Exception("Email phải đúng định dạng abc@abc.abc");
        }
        return true;
    }
}
