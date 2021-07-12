package _01_introduction_to_java.bai_tap;

import java.util.Scanner;

public class Tong {
     public  static  void tinhTong(int A[][],int n){
         int sum = 0;
         for (int i = 0; i < n; i++) {
             for (int j = 0; j < n; j++) {
                 sum += A[i][j];
             }
         }
         System.out.println("Tổng các phần tử = " + sum);
     }

    public static void main(String[] args) {
        int n;  // bậc của ma trận vuông
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào bậc của ma trận: ");
        n = scanner.nextInt();
        int A[][] = new int[n][n];
        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Ma trận A vừa nhập:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }
        Tong.tinhTong(A,n);
    }
}
