package controllers;

import java.util.Scanner;

public class MainController {
    Scanner scanner = new Scanner(System.in);

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
        }
    }

    public static void main(String[] args) {
        MainController main = new MainController();
        main.displayMainMenu();
    }
}
