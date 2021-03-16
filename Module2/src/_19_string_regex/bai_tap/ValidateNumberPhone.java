package _19_string_regex.bai_tap;

public class ValidateNumberPhone {
    public static void main(String[] args) {
        String regex = "[(][\\d]{2}[)]-[(](0)\\d{9}[)]";
        String sdt = "(84)-(0934739284)";
        System.out.println(sdt.matches(regex));
    }
}
