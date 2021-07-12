package _01_introduction_to_java.bai_tap;

import java.util.Scanner;

public class TongCheoChinh {
    public static void main(String[] args) {
        int n;  // bậc của ma trận vuông
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào bậc của ma trận: ");
        n = scanner.nextInt();

        int A[][] = new int[n][n]; //khai bao mang A

        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < n; i++) { //vong lap duyet mang cot i
            for (int j = 0; j < n; j++) { // vong lap duyet mang cot j
                 System.out.print("A[" + i + "]["+ j + "] = ");
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
        TongCheoChinh.tongCheoChinh(A,n);
    }
    public static void tongCheoChinh(int A[][] ,int n){ //truyen vao 1 mang 2 chieu A, bien n
        int sum =0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                // kiểm tra nếu i == j thì mới tính tổng
                if (i == j) {
                    sum += A[i][j];
                }
            }
        }
        System.out.println("Tổng các phần tử nằm trên đường chéo chính = " + sum);
    }
}
