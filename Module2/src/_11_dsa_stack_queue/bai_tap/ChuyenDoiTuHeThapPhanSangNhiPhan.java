package _11_dsa_stack_queue.bai_tap;

import java.util.Stack;

public class ChuyenDoiTuHeThapPhanSangNhiPhan {

    public void convertBinary(int num){
        Stack<Integer> stack = new Stack<>();
        while(num != 0){
            int d = num%2;
            stack.push(d);
            num/=2;
        }
        while(!(stack.isEmpty())){
            System.out.print(stack.pop());
        }
    }

    public static void main(String[] args) {
        int a = 12312423;
        System.out.print("Hệ nhị phân của " + a +" là :");
        new ChuyenDoiTuHeThapPhanSangNhiPhan().convertBinary(a);
    }
}
