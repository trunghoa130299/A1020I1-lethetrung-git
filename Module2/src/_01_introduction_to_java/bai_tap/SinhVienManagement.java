package _01_introduction_to_java.bai_tap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SinhVienManagement {
    public static void main(String[] args) throws Exception {
        List<SinhVien> sinhVienList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhâp so luong sinh vien");
        int n = scanner.nextInt();
        for (int i= 0; i<n;i++){
            boolean check = true;
            System.out.println("Nhập thông tin sinh viên thứ :"  + (i +1));
            scanner.nextLine();
            System.out.println("Nhập tên ");
            String ten = scanner.nextLine();
            System.out.println("nhap tuoi ");
            int tuoi ;
            do {
                tuoi = scanner.nextInt();
                try {
                    if (checkTuoi(tuoi)){
                        break;
                    }
                }catch (Exception e){
                   e.printStackTrace();
                    System.out.println("nhap lai");
                }
            }while (check);
            System.out.println("nhap diem triet");
            int diemTriet = scanner.nextInt();
            System.out.println("nhap diem kinh te chinh tri");
            int diemKinhTeChinhTri = scanner.nextInt();
            SinhVien sv = new SinhVien(ten,tuoi,diemTriet,diemKinhTeChinhTri);
            sinhVienList.add(sv);
        }
        for (int i =0;i<n;i++){
            System.out.println("thong tin sinh vien " +(i +1));
            System.out.println("ten " + sinhVienList.get(i).getTen());
            System.out.println("tuoi " + sinhVienList.get(i).getTuoi());
            System.out.println("diem diem triet " + sinhVienList.get(i).getDiemTriet());
            System.out.println("diem chinh tri " + sinhVienList.get(i).getDiemKinhTeChinhTri());
        }
    }
    public  static boolean checkTuoi(int tuoi) throws Exception {
        if (tuoi <= 0 ){
            throw  new Exception("tuoi khong phai la so am va lon hon khong");
        }
        return true;
    }
}
