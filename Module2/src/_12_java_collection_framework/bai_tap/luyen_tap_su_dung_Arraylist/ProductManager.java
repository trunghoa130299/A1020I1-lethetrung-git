package _12_java_collection_framework.bai_tap.luyen_tap_su_dung_Arraylist;

import java.util.*;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);
    List<Product> products = new ArrayList<>();

    public void addSP() {
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

    public String showList() {
        String list = "";
        for (int i = 0; i < products.size(); i++) {
            list += (i + 1 + ".id :" + products.get(i).getId() + " name : " + products.get(i).getName() + "\n");
        }
        return list;
    }

    public String showInfo(Product product) {
        String showInfo = "1.id : " + product.getId() + "2.name : " + product.getName() +
                "3.amount  : " + product.getAmount();
        return showInfo;
    }

    public void editSP() {
        System.out.println("product : " + showList());
        System.out.println("plese choose : ");
        int choose = scanner.nextInt();
        scanner.nextLine();
        System.out.println("thong tin :  " + showInfo(products.get(choose - 1)));
        System.out.println("input choose edit : ");
        int edit = scanner.nextInt();
        scanner.nextLine();
        switch (edit) {
            case 1:
                System.out.println("edit id : ");
                products.get(choose - 1).setId(scanner.nextLine());
                break;
            case 2:
                System.out.println("edit name : ");
                products.get(choose - 1).setName(scanner.nextLine());
                break;
            case 3:
                System.out.println("edit amount : ");
                products.get(choose - 1).setAmount(scanner.nextInt());
                break;
            default:
                System.out.println("fail");
        }
    }

    public void delSP() {
        System.out.println(showList());
        System.out.println("chon san pham can xoa : ");
        int choose = Integer.parseInt(scanner.nextLine());
        products.remove(choose - 1);
    }

    public void displaySP() {
        System.out.println(showList());
    }

    public void searchSP() {
        System.out.println("nhap ten muon tim kiem : ");
        String search = scanner.nextLine();
        for (Product d : products) {
            if ((d.getName() != null && d.getName().contains(search))) {
                System.out.println(d);
            }
        }
    }

    public void sapXepSP() {
        System.out.println("Please choose : ");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                sapXepGiam();
                break;
            case 2:
                sapXepTang();
                break;
        }
    }

    public void sapXepGiam() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getAmount() < o2.getAmount()) {
                    return 1;
                } else {
                    if (o1.getAmount() == o2.getAmount()) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });
        System.out.println("thu tu danh sach theo giam dan la : ");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void sapXepTang() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getAmount() < o2.getAmount()) {
                    return -1;
                } else {
                    if (o1.getAmount() == o2.getAmount()) {
                        return 0;
                    } else {
                        return 1;
                    }
                }
            }
        });
        System.out.println("thu tu danh sach theo tang dan la : ");
        for (Product product : products) {
            System.out.println(product);
        }
        ;
    }

}
