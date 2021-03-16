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
        boolean check = true;
        System.out.println("Nhập tên : ");
        String name ;
        do {
            name= scanner.nextLine();
            try {
                if (Validate.checkName(name)){
                    customer.setNameCustomer(name);
                    break;
                }
            }catch (Exception e){
                e.printStackTrace();
                System.out.println("Nhập lại : ");
            }
        }while (check);
        System.out.println("Nhập Ngày sinh : ");
        String day ;
        do {
            day = scanner.nextLine();
            try {
                if (Validate.checkDay(day)) {
                    customer.setDayOfBirth(day);
                    break;
                }
            }catch (Exception e){
                e.printStackTrace();
                System.out.println("Nhập lại ");
            }

        }while (check);

        System.out.println("Nhập giới tính : ");
        String gender;
        do {
            gender = scanner.nextLine();
            try {
                if (Validate.genderException(gender)) {
                    customer.setGender(gender);
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Nhập lại ");
            }
        } while (check);

        System.out.println("Nhập số cmnd :");
        String cmnd;
        do {
            cmnd=scanner.nextLine();
            try {
                if (Validate.checkIDCard(cmnd)){
                    customer.setCmnd(cmnd);
                    break;
                }
            }catch (Exception e){
                e.printStackTrace();
                System.out.println("Nhập lại : ");
            }
        }while (check);
        System.out.println("Nhập sdt : ");
        customer.setSdt(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Nhập email : ");
        String email;
        do {
            email = scanner.nextLine();
            try {
                if (checkEmail(email)) {
                    customer.setEmail(email);
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Nhập lại ");
            }
        } while (check);
        customer.setEmail(email);
        System.out.println("Nhập loại khách  : ");
        customer.setTypeOfCustomer(scanner.nextLine());
        System.out.println("Nhập địa chỉ : ");
        customer.setAddress(scanner.nextLine());
        FuncWriteAndRead.writeCustomer(customer);
    }
}
