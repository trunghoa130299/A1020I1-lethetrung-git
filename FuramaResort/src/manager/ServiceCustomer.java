package manager;

import commons.Validate;
import models.Customer;

import java.util.Scanner;

public class ServiceCustomer {
    Scanner scanner = new Scanner(System.in);

    public void addCustomer() {
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
        scanner.nextLine();
        System.out.println("Nhập email : ");
        String email = scanner.nextLine();
        do {
            if (Validate.checkEmail(email)){
                customer.setEmail(email);
            }else {
                System.out.println("email không hợp lệ ! Vui lòng nhập lại : ");
                email = scanner.nextLine();
            }
        }while (!Validate.checkEmail(email));
        System.out.println("Nhập loại khách  : ");
        customer.setTypeOfCustomer(scanner.nextLine());
        System.out.println("Nhập địa chỉ : ");
        customer.setAddress(scanner.nextLine());
    }
}
