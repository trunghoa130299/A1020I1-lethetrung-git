package commons;

import models.Customer;
import models.House;
import models.Room;
import models.Villa;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static commons.FuncWriteAndRead.*;

public class AddBooking {
    Scanner scanner = new Scanner(System.in);
    int choose;
    static ArrayList<Customer> listCustomer = readCustomer();

    public static String showListCustomer() {
        String list1 = "";
        for (int i = 0; i < listCustomer.size(); i++) {
            list1 += (i + 1 + " name : " + listCustomer.get(i).getNameCustomer() + "\n");
        }
        return list1;
    }

    public static String showInfoCustomer(Customer customer) {
        String list = " 1.name : " + customer.getNameCustomer() + " 2.Ngày sinh : " +
                customer.getDayOfBirth() + " 3.Gender : " + customer.getGender() +
                " 4.Sdt : " + customer.getSdt() + " Email : " +
                customer.getEmail() + " 5.Loại khách " + customer.getTypeOfCustomer()
                + " 6.Địa chỉ :" + customer.getAddress() + "\n";
        return list;
    }

    public void ShowCustomer() {
        System.out.println("Danh sách Customer : " + AddBooking.showListCustomer());
        choose = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Thong tin customer:  " + AddBooking.showInfoCustomer(listCustomer.get(choose - 1)));
        System.out.println("Input choose service : 1.\tBooking Villa\n" +
                "2.\tBooking House\n" +
                "3.\tBooking Room\n ");
        System.out.println("Service bạn muốn booking là  : ");
        int choose2 = scanner.nextInt();
        scanner.nextLine();
        switch (choose2) {
            case 1:
                FuncWriteAndRead.showVilla();
                WriteCustomerVilla();
                break;
            case 2:
                FuncWriteAndRead.showHouse();
                WriteCustomerHouse();
                break;
            case 3:
                FuncWriteAndRead.showRoom();
                WriteCustomerRoom();
                break;
            default:
                System.out.println("Fail");
        }
    }

    public void WriteCustomerVilla() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Villa> listVilla = readVilla();
        System.out.println("Please choose number villa : ");
        int choose3 = scanner.nextInt();
        System.out.println(listVilla.get(choose3 - 1));
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("src\\data\\booking.csv", true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(listCustomer.get(choose - 1).getNameCustomer()
                    + "," + readVilla().get(choose3 - 1).getId());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Thêm Thành Công ");
    }

    public void WriteCustomerHouse() {
        Scanner scanner2 = new Scanner(System.in);
        ArrayList<House> listHouse = readHouse();
        System.out.println("Please choose villa");
        int choose4 = scanner2.nextInt();
        System.out.println(listHouse.get(choose4 - 1));
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("src\\data\\booking.csv", true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(listCustomer.get(choose - 1).getNameCustomer()
                    + "," + readHouse().get(choose4 - 1).getId());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void WriteCustomerRoom() {
        Scanner scanner3 = new Scanner(System.in);
        ArrayList<Room> listRoom = readRoom();
        System.out.println("Please choose villa");
        int choose5 = scanner3.nextInt();
        System.out.println(listRoom.get(choose5 - 1));
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("src\\data\\booking.csv", true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(listCustomer.get(choose - 1).getNameCustomer()
                    + "," + readRoom().get(choose5 - 1).getId());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
