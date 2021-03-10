package controllers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MainController main1 = new MainController();
        while (true) {
            System.out.println("1.\t Add New Services\n" +
                    "2.\tShow Services\n" +
                    "3.\tAdd New Customer\n" +
                    "4.\tShow Information of Customer\n" +
                    "5.\tAdd New Booking\n" +
                    "6.\tShow Information of Employee\n" +
                    "7.\tExit\n");
            System.out.println("Please Choose ");
            int choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1:
                    main1.addNewServies();
                    break;
                case 2:
                    main1.showServices();
                    break;
                case 3:
                    main1.addCustomer();
                case 4:
                case 5:
                case 6:
                case 7:
                default:
                    System.out.println("Fail");
            }
        }
    }
}
