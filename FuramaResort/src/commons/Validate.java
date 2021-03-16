package commons;

import java.util.Calendar;

public class Validate {
    public  static  boolean checkEmail(String email) throws Exception{
        String ePattern = "^[a-z\\_\\.\\-]{2,20}\\@[a-z\\_\\-]{2,20}\\.[a-z]{2,9}$";
        if (!email.matches(ePattern)) {
            throw new Exception("Email phải đúng định dạng abc@abc.abc");
        }
        return true;
    }
    public static boolean checkName(String name) throws Exception {
        String nameRegex = "^[A-Z]{1}[a-z]+(\\s[A-Z]{1}[a-z]+)+$";
        if (!name.matches(nameRegex)){
            throw new Exception("Tên Khách hàng phải in hoa ký tự đầu tiên trong mỗi từ");
        }
        return true;
    }
    public static boolean genderException(String gender) throws Exception{
        if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female") ||
                gender.equalsIgnoreCase("unknown")){
            return true;
        }
        else {
            throw new Exception("Phải nhập male/female/unknown");
        }
    }
    public static boolean checkDay(String day) throws Exception {
        String dayRegex =
                "^(([0-2][0-9])|(30)|(31))\\/(([0][1-9])|([1][0-2]))\\/(([1][9][0-9)][0-9])|([2][0][0-2][0-1]))$";
        if (day.matches(dayRegex)) {
            if ((Integer.parseInt(day.substring(6, 10)) + 18) <= Calendar.getInstance().get(Calendar.YEAR)) {
                return true;
            }
        }throw new Exception("Sai! nhập lại ");
    }
    public static boolean checkIDCard(String cmnd) throws Exception {
        String cmndRegex = "\\d{3}\\s\\d{3}\\s\\d{3}";
        if (!cmnd.matches(cmndRegex)){
            throw new Exception("Id Card phải có 9 chữ số và theo định dạng XXX XXX XXX");
        }
        return true;
    }

}
