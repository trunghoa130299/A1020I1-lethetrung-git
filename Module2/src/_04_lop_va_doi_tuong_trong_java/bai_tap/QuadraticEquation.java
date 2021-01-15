package _04_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c,delta ;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant(double a,double b, double c) {
        return delta =b * 2 - (4 * a * c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so a");
        double a= scanner.nextDouble();
        System.out.println("nhap vao so b");
        double b = scanner.nextDouble();
        System.out.println("nhap vao so c");
        double c= scanner.nextDouble();
        QuadraticEquation test = new QuadraticEquation(a,b,c);
        test.setA(a);

    }
}
