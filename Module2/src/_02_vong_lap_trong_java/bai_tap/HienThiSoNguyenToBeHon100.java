package _02_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThiSoNguyenToBeHon100 {
    static boolean kiemTraSnt(int number){
        int count =0;
        for (int i=1;i<=number;i++){
            if (number % i == 0){
                count++;
            }
        }

        if (count==2){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("nhap n ");
        n=sc.nextInt();
        System.out.println("tat ca cac so nguyen to be hon N la ");
        for (int i=2;i<n;i++){
            if (kiemTraSnt(i)){
                System.out.print(i + ",");
            }
        }
    }
}
