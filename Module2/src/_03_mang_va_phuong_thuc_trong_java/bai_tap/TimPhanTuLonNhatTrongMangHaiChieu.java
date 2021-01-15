package _03_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TimPhanTuLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        int m, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so dong cua ma tran : ");
        m = scanner.nextInt();
        System.out.println("Nhap vao so cot cua ma tran : ");
        n = scanner.nextInt();
        int A[][] = new int[m][n];

        System.out.println("Nhap vao cac phan tu  ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }
        int max = A[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < A[i][j]) {
                    max = A[i][j];
                }
            }
    }
        System.out.println("max la "+ max);
    }
}
