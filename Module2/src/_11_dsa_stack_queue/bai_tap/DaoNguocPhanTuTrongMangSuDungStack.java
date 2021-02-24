package _11_dsa_stack_queue.bai_tap;

import java.util.Arrays;
import java.util.Stack;

public class DaoNguocPhanTuTrongMangSuDungStack {
    public static void main(String[] args) {
        //bai1
//        Stack<Integer> stack = new Stack<>();
//        int[] array = {1, 2, 3, 4, 5, 6};
//        for (int i = 0; i < array.length; i++) {
//            stack.push(array[i]);
//        }
//        System.out.println(stack);
//        for (int i = 0; !stack.empty(); i++) {
//            array[i] = stack.pop();
//        }
//        System.out.println(Arrays.toString(array));
        //bai2
        Stack<String> stack = new Stack<>();
        String[] array = {"abc","zxc","anc"};
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        System.out.println(stack);
        for (int i = 0; !stack.empty(); i++) {
            array[i] = stack.pop();
        }
        System.out.println(Arrays.toString(array));
    }
}
