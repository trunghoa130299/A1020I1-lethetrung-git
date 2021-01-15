package _04_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Scanner;

public class OOPQuadraticEquation {
    public static void main(String[] args) {
        double a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so a");
        a= scanner.nextDouble();
        System.out.println("nhap vao so b");
        b = scanner.nextDouble();
        System.out.println("nhap vao so c");
        c= scanner.nextDouble();
        QuadraticEquation qe = new QuadraticEquation(a,b,c);
        if(qe.getDiscriminant()<0) {
            System.out.println("The equation has no roots");
        }
        else if(qe.getDiscriminant()==0) {
            System.out.println("The equation has one root: "+qe.getRoot1());
        }
        else{
            System.out.println("The equation has two roots: ");
            System.out.println("Denta is: "+qe.getDiscriminant());
            System.out.println("Root1 is: "+qe.getRoot1());
            System.out.println("Root2 is: "+qe.getRoot2());
        }
    }
}
