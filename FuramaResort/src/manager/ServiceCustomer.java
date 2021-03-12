package manager;

import commons.FuncWriteAndRead;
import commons.Validate;
import models.Customer;

import java.util.Scanner;

import static commons.Validate.*;

public class ServiceCustomer {
    Scanner scanner = new Scanner(System.in);

    public void addCustomer() throws Exception {
        Customer customer = new Customer();
        System.out.println("Nhập tên : ");
        customer.setNameCustomer(scanner.nextLine());
        System.out.println("Nhập Ngày sinh : ");
        customer.setDayOfBirth(scanner.nextLine());
        System.out.println("Nhập giới tính : ");
        String gender = scanner.nextLine();
        do {
            try {
                if (Validate.genderException(gender)) {
                    customer.setGender(gender);
                }else {
                    throw new Exception();
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Nhập lại ");
                gender = scanner.nextLine();
            }
        } while (Validate.genderException(gender));
        customer.setGender(gender);
        System.out.println("Nhập số cmnd :");
        customer.setCmnd(scanner.nextInt());
        System.out.println("Nhập sdt : ");
        customer.setSdt(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Nhập email : ");
        String email = scanner.nextLine();
        do {
            try {
                if (!checkEmail(email)) {
                    throw new Exception();
                } else {
                    customer.setEmail(email);
                }
            }catch (Exception e){
                e.printStackTrace();
                System.out.println("Nhập lại ");
                email= scanner.nextLine();
            }
        }while (checkEmail(email));
        customer.setEmail(email);
        System.out.println("Nhập loại khách  : ");
        customer.setTypeOfCustomer(scanner.nextLine());
        System.out.println("Nhập địa chỉ : ");
        customer.setAddress(scanner.nextLine());
        FuncWriteAndRead.writeCustomer(customer);
    }
}
