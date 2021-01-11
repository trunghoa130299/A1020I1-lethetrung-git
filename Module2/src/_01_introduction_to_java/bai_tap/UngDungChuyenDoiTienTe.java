package _01_introduction_to_java.bai_tap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd =23000;
        double usd;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Moi ban nhap so tien VND ");
        usd= scanner.nextDouble();
        double quydoi = usd * 23000;
        System.out.println("so tien quy doi la  "  + quydoi);
    }
}
