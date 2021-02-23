package controllers;

import commons.FuncWriteAndRead;
import manager.ServiceManager;
import models.Villa;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainController {
    Scanner scanner = new Scanner(System.in);
    ServiceManager villa1= new ServiceManager();
    public void displayMainMenu() {

        System.out.println("1.\t Add New Services\n" +
                "2.\tShow Services\n" +
                "3.\tAdd New Customer\n" +
                "4.\tShow Information of Customer\n" +
                "5.\tAdd New Booking\n" +
                "6.\tShow Information of Employee\n" +
                "7.\tExit\n");
        System.out.println("Please Choose ");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                addNewServies();
                break;
            case 2:
                showServices();
                break;
        }
    }

    public void addNewServies() {
        System.out.println("1.\tAdd New Villa\n" +
                "2.\tAdd New House\n" +
                "3.\tAdd New Room\n" +
                "4.\tBack to menu\n" +
                "5.\tExit\n");
        System.out.println("Please choose: ");
        int choose2 = scanner.nextInt();
        switch (choose2) {
            case 1:
                villa1.addVilla();
            case 2:
            case 3:
            case 4:
                displayMainMenu();
                break;
            case 5:
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
                String[] listvilla ={"abc,abc,abl"};
                List<String> list1= Arrays.asList(listvilla);
                for (String s : list1){
                    System.out.println(s);
                }
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                displayMainMenu();
                break;
            case 8:
        }
    }

    public static void main(String[] args) {
        MainController main = new MainController();
        main.displayMainMenu();
    }
}
