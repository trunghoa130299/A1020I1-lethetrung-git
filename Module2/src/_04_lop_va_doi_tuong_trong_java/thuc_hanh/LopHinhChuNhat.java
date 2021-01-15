package _04_lop_va_doi_tuong_trong_java.thuc_hanh;

import java.util.Scanner;

public class LopHinhChuNhat {
    public static class Rectangle {
        double width, height;
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public String display() {
            return "Rectangle{" + "width=" + width + ", height=" + height + "}";
        }

        public double getPerimeter() {
            return (this.width + this.height) * 2;
        }

        public double getArea() {
            return this.width * this.height;
        }
        //code below here
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
}
