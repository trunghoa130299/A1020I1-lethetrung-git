package _11_dsa_stack_queue.bai_tap;

import java.util.Stack;

public class KiemTraDauNgoacTrongBieuThuc {
    Stack<Character> stack = new Stack<>();
    public boolean kiemTra(String a){
        for (int i = 0;i<a.length();i++){
            if (a.charAt(i)=='('){
                stack.push(a.charAt(i));
            }else if (a.charAt(i)==')'){
                if (stack.isEmpty()){
                    return false;
                }else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String a = "s * (s – a) * (s – b) * (s – c)";
        KiemTraDauNgoacTrongBieuThuc kiemTraDauNgoacTrongBieuThuc= new KiemTraDauNgoacTrongBieuThuc();
        System.out.println(kiemTraDauNgoacTrongBieuThuc. kiemTra(a));

    }
}
