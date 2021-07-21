package bai_tap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeMain {
    static List<XeMay> xeMayList = new ArrayList<>();
    static List<Oto> otoList = new ArrayList<>();
    static List<Xe> xeList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void nhapXeMay() {
        System.out.println("nhap so cho ngoi");
        int socho = scanner.nextInt();
        System.out.println("nhap trong luong");
        int trongluong = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhap mau xe");
        String mauxe = scanner.nextLine();
        System.out.println("nhap gia ");
        int gia = scanner.nextInt();
        XeMay xeMay = new XeMay(socho, trongluong, mauxe, gia);
        xeMayList.add(xeMay);
        xeList.add(xeMay);
    }

    public static void nhapOto() {
        System.out.println("nhap so cho ngoi");
        int socho = scanner.nextInt();
        System.out.println("nhap trong luong");
        int trongluong = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhap mau xe");
        String mauxe = scanner.nextLine();
        System.out.println("nhap hang xe");
        String hangxe = scanner.nextLine();
        System.out.println("nhap toc do ");
        int tocdo = scanner.nextInt();
        Oto oto = new Oto(socho, trongluong, mauxe, hangxe, tocdo);
        otoList.add(oto);
        xeList.add(oto);
    }
    public static void showXe() {
        for (int i = 0; i < 1; i++) {
            System.out.println(xeList);
        }
    }


    public static void showXeMay() {
        for (int i = 0; i < xeMayList.size(); i++) {
            System.out.println("so cho ngoi " + xeMayList.get(i).getSoChoNgoi());
            System.out.println("trong luong " + xeMayList.get(i).getTrongLuong());
            System.out.println("mau xe " + xeMayList.get(i).getMauXe());
            System.out.println("gia" + xeMayList.get(i).getGia() + "\n");
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("1.\t them xe may\n" +
                    "2.\tthem oto\n" +
                    "3.\thien thi danh sach xe may\n" +
                    "4.\thien thi danh sach oto\n" +
                    "5.\thien thi danh sach oto co so cho lon hon 5\n" +
                    "6.\thien thi danh sach oto co so cho lon hon 5\n");
            System.out.println("Please Choose ");
            int choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1:
                    XeMain.nhapXeMay();
                    break;
                case 2:
                    XeMain.nhapOto();
                    break;
                case 3:
                    XeMain.showXeMay();
                    break;
                case 4:
                    XeMain.showOto();
                    break;
                case 5:
                    XeMain.showOto5();
                    break;
                case 6:
                    XeMain.showXe();
                    break;
            }
        }
    }

    private static void showOto5() {
        for (int i = 0; i < otoList.size(); i++) {
            if (otoList.get(i).getSoChoNgoi() >= 5) {
                System.out.println("so cho ngoi " + otoList.get(i).getSoChoNgoi());
                System.out.println("trong luong " + otoList.get(i).getTrongLuong());
                System.out.println("mau xe " + otoList.get(i).getMauXe());
                System.out.println("hang xe " + otoList.get(i).getHangXe());
                System.out.println("toc do " + otoList.get(i).getTocDo() + "\n");
            }
        }
    }
    private static void showOto() {
        for (int i = 0; i < otoList.size(); i++) {
            System.out.println("so cho ngoi " + otoList.get(i).getSoChoNgoi());
            System.out.println("trong luong " + otoList.get(i).getTrongLuong());
            System.out.println("mau xe " + otoList.get(i).getMauXe());
            System.out.println("hang xe " + otoList.get(i).getHangXe());
            System.out.println("toc do " + otoList.get(i).getTocDo() + "\n");
        }
    }
}
