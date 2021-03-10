package controllers;

import commons.FuncWriteAndRead;
import manager.ServiceManager;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainController {
    Scanner scanner = new Scanner(System.in);
    ServiceManager villa1= new ServiceManager();
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
    public void showServices(){
        System.out.println("1.\tShow all Villa\n" +
                "2.\tShow all House\n" +
                "3.\tShow all Room\n" +
                "4.\tShow All Name Villa Not Duplicate\n" +
                "5.\tShow All Name House Not Duplicate\n" +
                "6.\tShow All Name Name Not Duplicate\n" +
                "7.\tBack to menu\n" +
                "8.\tExit\n");
        int choose3 = scanner.nextInt();
        switch (choose3){
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
            case 5:
            case 6:
            case 7:
                Main main = new Main();
                break;
            case 8:
                break;
            default:
                System.out.println("Fail");
        }
    }
    public void addCustomer(){

    }
}
