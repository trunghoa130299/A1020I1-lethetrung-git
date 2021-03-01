package _12_java_collection_framework.bai_tap.luyen_tap_su_dung_Arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);
    List<Product> products = new ArrayList<>();
    public void addSP(){
            Product product = new Product();
            System.out.println("nhap id ");
            product.setId(scanner.nextLine());
            System.out.println("nhap ten ");
            product.setName(scanner.nextLine());
            System.out.println("nhap gia ");
            product.setAmount(scanner.nextInt());
            scanner.nextLine();
            products.add(product);
    }
    public String showList(){
        String list  = "";
        for (int i=0;i<products.size();i++){
            list +=(i+1 + ".id :" + products.get(i).getId() + " name : " +products.get(i).getName() +"\n") ;
        }
        return list;
    }
    public String showInfo(Product product){
        String showInfo = "1.id : " + product.getId() + "2.name : " + product.getName() +
                "3.amount  : " + product.getAmount();
        return showInfo;
    }
    public void editSP(){
        System.out.println("product : " + showList());
        System.out.println("plese choose : ");
        int choose = Integer.parseInt(scanner.nextLine());
        System.out.println("thong tin :  " + showInfo(products.get(choose-1)));
        System.out.println("input choose edit : ");
        int edit = Integer.parseInt(scanner.nextLine());
        switch (edit){
            case 1:
                System.out.println("edit id : ");
                products.get(choose-1).setId(scanner.nextLine());
                break;
            case 2:
                System.out.println("edit name : ");
                products.get(choose-1).setName(scanner.nextLine());
                break;
            case 3:
                System.out.println("edit amount : ");
                products.get(choose-1).setAmount(scanner.nextInt());
                break;
            default:
                System.out.println("fail");
        }
    }
    public void delSP(){
        System.out.println(showList());
        System.out.println("chon san pham can xoa : ");
        int choose = Integer.parseInt(scanner.nextLine());
        products.remove(choose-1);
    }
    public void displaySP(){
        System.out.println(showList());
    }
    public void searchSP(){

    }
    public void sapXepSP(){

    }
}
