package _19_string_regex.bai_tap;

public class ValidateClass {
    public static void main(String[] args) {
        String nameClassRegex = "(C|A|P)\\d{4}(G|H|I|K|L|M)";
        String nameClass = "A1020I";
        System.out.println(nameClass.matches(nameClassRegex));
    }
}
