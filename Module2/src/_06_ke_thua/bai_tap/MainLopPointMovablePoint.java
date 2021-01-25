package _06_ke_thua.bai_tap;

public class MainLopPointMovablePoint {
    public static void main(String[] args) {
        LopPoint lopPoint = new LopPoint();
        lopPoint.setX(3);
        lopPoint.setY(4);
        System.out.println(lopPoint.toString());
        MovablePoint movablePoint = new MovablePoint();
        movablePoint.setX(lopPoint.getX());
        movablePoint.setY(lopPoint.getY());
        movablePoint.setXSpeed(5);
        movablePoint.setYSpeed(6);
        System.out.println(movablePoint.toString());
        System.out.println(movablePoint.move());
    }
}
