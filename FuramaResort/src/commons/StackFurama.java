package commons;

import java.util.Stack;

public class StackFurama {
    public static void searchStack(){
        Stack<String> stack = new Stack<>();
        stack.push("ao");
        stack.push("quan");
        stack.push("day");
        stack.push("dep");
        stack.push("mu");
        System.out.println("Stack : " + stack);
        int i = stack.search("quan");
        System.out.println("Vi tri : " + i);
    }

    public static void main(String[] args) {
        searchStack();
    }
}
