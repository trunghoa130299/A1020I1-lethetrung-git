package _03_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TimPhanTuNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n ;
        System.out.println("nhap sô luong phan tu cua mang");
        n= scanner.nextInt();
        int []array = new int[n];
        System.out.println("nhap phan tu cua mang");
        for (int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }
        int min=array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]<min){
                min=array[i];
            }
        }
        System.out.println(min);
    }
}
