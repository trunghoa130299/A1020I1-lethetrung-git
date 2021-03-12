package commons;

import java.util.Calendar;

import java.util.regex.Pattern;
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
        if (gender.equals("male") || gender.equals("female") || gender.equals("unknown")){
            return true;
        }
        else {
            throw new Exception("Phải nhập male/female/unknown");
        }
    }
    public static boolean checkDay(String day) throws Exception {
        String dayRegex = "^(([0-2][0-9])|(30)|(31))\\/(([0][1-9])|([1][0-2]))\\/(([1][9][0-9)][0-9])|([2][0][0-2][0-1]))$";
        if (day.matches(dayRegex)) {
            if ((Integer.parseInt(day.substring(6, 10)) + 18) <= Calendar.getInstance().get(Calendar.YEAR)) {
                return true;
            }
        }throw new Exception("Sai! nhập lại ");

    }
}
