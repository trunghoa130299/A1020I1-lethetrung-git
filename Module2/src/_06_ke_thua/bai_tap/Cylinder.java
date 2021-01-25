package _06_ke_thua.bai_tap;

public class Cylinder  extends  Circle{
    private double height;
    public Cylinder(){
        super();
    }

    public Cylinder(float radius, String color,double height) {
        super(radius, color);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getTotalArea(){
        return  super.getAreAa() * this.height;
    }

    @Override
    public String toString() {
        return getTotalArea() + "";
    }
}
