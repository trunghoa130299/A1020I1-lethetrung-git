package commons;

import java.util.LinkedList;
import java.util.Queue;

public class QueueFurama {
    public static void displayQueue(){
        Queue<String> queue = new LinkedList();
        queue.offer("Trung");
        queue.offer("Thành");
        queue.offer("Đạt");
        queue.offer("Thái");
        queue.offer("Tuấn");
        for (String s:queue) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
     displayQueue();
    }
}
