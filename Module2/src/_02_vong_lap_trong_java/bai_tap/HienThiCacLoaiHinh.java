package _02_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice=-1;
        while(choice!= 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw the triangle");
                    for (int i=7;i>=1;i--){
                        System.out.print("*");
                        for (int j=1;j<i;j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Draw the square");
                    for (int i=0;i<6;i++){
                        System.out.print("*");
                        for (int j=0;j<5;j++){
                            System.out.print(" "+"*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    for (int i=0;i<3;i++){
                        System.out.print("*");
                        for (int j=0;j<6;j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
