package _06_ke_thua.bai_tap;

public class MainPoint2DPoint3D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.setX(2);
        point2D.setY(3);
        System.out.println(point2D.toString());
        Point3D point3D = new Point3D();
        point3D.setX(point2D.getX());
        point3D.setY(point2D.getY());
        point3D.setZ(4);
        System.out.println(point3D.toString());
    }
}
