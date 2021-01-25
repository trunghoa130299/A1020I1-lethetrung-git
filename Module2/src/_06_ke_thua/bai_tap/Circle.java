package _06_ke_thua.bai_tap;

public class Circle {
    private float radius;
    private String color;

    public Circle() {
    }

    public Circle(float radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getAreAa(){
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return getAreAa() + "";
    }

}
