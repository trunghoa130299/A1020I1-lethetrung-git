package _12_java_collection_framework.bai_tap.luyen_tap_su_dung_Arraylist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        while (true){
        System.out.println("1.Thêm sản phẩm\n" +
                "2.Sửa thông tin sản phẩm theo id\n" +
                "3.Xoá sản phẩm theo id\n" +
                "4.Hiển thị danh sách sản phẩm\n" +
                "5.Tìm kiếm sản phẩm theo tên\n" +
                "6. 1.Sắp xếp sản phẩm giảm dần, 2.tăng dần theo giá");
        System.out.println("please choose : ");
        int choose = scanner.nextInt();
        scanner.nextLine();
        switch (choose){
            case 1:
                productManager.addSP();
                break;
            case 2:
                productManager.editSP();
                break;
            case 3:
                productManager.delSP();
                break;
            case 4:
                productManager.displaySP();
                break;
            case 5:
                productManager.searchSP();
                break;
            case 6:
                productManager.sapXepSP();
                break;
            default:
                System.out.println("fail");
        }
    }
}
}
