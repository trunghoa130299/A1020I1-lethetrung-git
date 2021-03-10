package manager;

import models.Customer;

import java.util.Scanner;

public class ServiceCustomer {
    Scanner scanner = new Scanner(System.in);
    public void addCustomer(){
        Customer customer = new Customer();
        System.out.println("Nhập tên : ");
        customer.setNameCustomer(scanner.nextLine());
        System.out.println("Nhập Ngày sinh : ");
        customer.setDayOfBirth(scanner.nextLine());
        System.out.println("Nhập giới tính : ");
        customer.setGender(scanner.nextLine());
        System.out.println("Nhập số cmnd :");
        customer.setCmnd(scanner.nextInt());
        System.out.println("Nhập sdt : ");
        customer.setSdt(scanner.nextInt());
        System.out.println("Nhập email : ");
        customer.setEmail(scanner.nextLine());
        System.out.println("Nhập loại khách ");
        customer.setTypeOfCustomer(scanner.nextLine());
        System.out.println("Nhập địa chỉ : ");
        customer.setAddress(scanner.nextLine());

    }
    public void checkNameCustomer(String name){
        Boolean check = false;
        do {


        }while (!check);
    }
}
