package _03_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int []  a = {1,2,3,4,5,6};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap phan tu can xoa ");
        int x = scanner.nextInt();
        int index,i;
        int count = a.length;
        for (index = i = 0; i < a.length; i++) {
            if (a[i] != x) {
                a[index] = a[i];
                index++;
            }
        }
        count=index;
        for (i=0;i<count;i++){
            System.out.println(a[i]);
        }

    }
}
