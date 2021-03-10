package _15_xu_li_ngoai_le_debug.bai_tap;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap gia tri 3 canh cua tam giac :");
        System.out.println("nhap a : ");
        int a = scanner.nextInt();
        System.out.println("nhap b : ");
        int b = scanner.nextInt();
        System.out.println("nhap c : ");
        int c = scanner.nextInt();
        try {
            if (checkTamGiac(a,b,c)){
                System.out.println("đúng");
            }else {
                System.out.println("sai");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public static boolean checkTamGiac(int a,int b, int c) throws Exception {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw  new  Exception(" so nhap vao be hon khong ");
        }else if (a + b < c || a + c < b || b + c < a) {
            throw new Exception("so nhap vao co tong be hon");
        }
        return true;
    }
}
