package _06_ke_thua.bai_tap;

public class MainCircleCylinder {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.setRadius(5);
        System.out.println("Area circle :" + circle.getAreAa());

        Cylinder cylinder = new Cylinder(circle.getRadius(), circle.getColor(), 10);
        System.out.println("Total is: " + cylinder.getTotalArea());
    }
}
