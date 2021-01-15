package _03_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int index,item;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vi tri can them ");
        index= scanner.nextInt();
        System.out.println("nhap gia tri ");
        item= scanner.nextInt();
        int[] array = {1,2,4,5};
        int j = array.length;
        int[] array1 = new int[array.length+1];
        while(j >index){
            array1[j] = array[j-1];
            j--;
        }
        array1[index] = item;
        for(int i = 0;i<index;i++){
            array1[i] = array[i];
        }
        for(int i : array1){
            System.out.println(i);
        }
    }
}
