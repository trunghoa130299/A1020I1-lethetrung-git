package _04_lop_va_doi_tuong_trong_java.bai_tap;

public class XayDungLopFan {
    final int SLOW =1;
    final int MEDIUM=2;
    final int FAST=3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius =5;
    private String color = "blue";

    public XayDungLopFan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSlow() {
        return SLOW;
    }

    public int getMedium() {
        return MEDIUM;
    }

    public int getFast() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (this.on==true) {
            return "XayDungLopFan{" +
                    "speed= " + speed +
                    ", color = " + color +
                    ", radius= " + radius  +
                    ",fan is on" +
                    '}';
        }else {
            return "XayDungLopFan{" +
                    "speed= " + speed +
                    ", color = " + color  +
                    ", radius= " + radius +
                    ",fan is false" +
                    '}';
        }
    }
}
