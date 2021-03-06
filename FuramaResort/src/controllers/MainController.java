package controllers;

import commons.AddBooking;
import commons.EmployeeMap;
import commons.FuncWriteAndRead;
import commons.ShowAllNameServiceDuplicate;
import manager.ServiceCustomer;
import manager.ServiceManager;

import java.util.Scanner;

public class MainController {
    Scanner scanner = new Scanner(System.in);
    AddBooking addBooking = new AddBooking();
    ServiceManager villa1 = new ServiceManager();
    ServiceCustomer serviceCustomer = new ServiceCustomer();
    FuncWriteAndRead funcWriteAndRead = new FuncWriteAndRead();

    public void addNewServies() {
        System.out.println("1.\tAdd New Villa\n" +
                "2.\tAdd New House\n" +
                "3.\tAdd New Room\n" +
                "4.\tBack to menu\n" +
                "5.\tExit\n");
        System.out.println("Please choose: ");
        int choose2 = scanner.nextInt();
        scanner.nextLine();
        switch (choose2) {
            case 1:
                villa1.addVilla();
                break;
            case 2:
                villa1.addHouse();
                break;
            case 3:
                villa1.addRoom();
                break;
            case 4:
                Main main = new Main();
            case 5:
                break;
            default:
                System.out.println("Fail");
        }
    }

    public boolean showServices() {
        while (true) {
            System.out.println("1.\tShow all Villa\n" +
                    "2.\tShow all House\n" +
                    "3.\tShow all Room\n" +
                    "4.\tShow All Name Villa Not Duplicate\n" +
                    "5.\tShow All Name House Not Duplicate\n" +
                    "6.\tShow All Name Name Not Duplicate\n" +
                    "7.\tBack to menu\n" +
                    "8.\tExit\n");
            int choose3 = scanner.nextInt();
            switch (choose3) {
                case 1:
                    funcWriteAndRead.showVilla();
                    break;
                case 2:
                    funcWriteAndRead.showHouse();
                    break;
                case 3:
                    funcWriteAndRead.showRoom();
                    break;
                case 4:
                    ShowAllNameServiceDuplicate.showNameVillaDuplicate();
                    break;
                case 5:
                    ShowAllNameServiceDuplicate.showNameHouseDuplicate();
                    break;
                case 6:
                    ShowAllNameServiceDuplicate.showNameRoomDuplicate();
                    break;
                case 7:
                    return true;
                case 8: return false;
                default:
                    System.out.println("Fail");
            }
        }
    }

    public void addCustomer() throws Exception {
        serviceCustomer.addCustomer();
    }

    public void showInfoCustomer() {
        FuncWriteAndRead.showInformationCustomer();

    }

    public void addNewBooking() {
        addBooking.ShowCustomer();
    }

    public void showInfoEmployee() {
        EmployeeMap.showEmployee();
    }
}
