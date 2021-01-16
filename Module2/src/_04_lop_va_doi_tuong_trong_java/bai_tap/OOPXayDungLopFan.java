package _04_lop_va_doi_tuong_trong_java.bai_tap;

public class OOPXayDungLopFan {
    public static void main(String[] args) {
        final int slow =1,medium=2,fast=3;
        double radius;
        XayDungLopFan Fan1= new XayDungLopFan(fast,true,10,"yellow");
        XayDungLopFan Fan2= new XayDungLopFan(medium,false,5,"blue");
        System.out.println(Fan1.toString());
        System.out.println(Fan2.toString());
    }
}
