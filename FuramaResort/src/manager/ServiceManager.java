package manager;

import commons.FuncWriteAndRead;
import models.Villa;

import java.util.Scanner;

public class ServiceManager {
    Scanner scanner = new Scanner(System.in);
    public void addVilla(){
        System.out.println("Nhap ID :");
        String id = scanner.nextLine();
        System.out.println("Nhap ten :");
        String name = scanner.nextLine();
        System.out.println("Nhap area :");
        double area = scanner.nextDouble();
        System.out.println("Nhap amount : ");
        int amount = scanner.nextInt();
        System.out.println("Nhap cost : ");
        int cost = scanner.nextInt();
        System.out.println("Nhap rentaltype : ");
        int rentaltype = scanner.nextInt();
        System.out.println("Nhap standardroom : ");
        String standardroom = scanner.nextLine();
        System.out.println("Nhap other : ");
        String other = scanner.nextLine();
        System.out.println("Nhap arealake : ");
        double arealake = scanner.nextDouble();
        System.out.println("Nhap numberoffloor: ");
        int numberoffloor = scanner.nextInt();
        Villa villa = new Villa();
        villa.setId(id);
        villa.setName(name);
        villa.setArea(area);
        villa.setAmount(amount);
        villa.setCost(cost);
        villa.setRentalType(rentaltype);
        villa.setStandardRoom(standardroom);
        villa.setOther(other);
        villa.setAreaLake(arealake);
        villa.setNumberOfFloors(numberoffloor);
        FuncWriteAndRead.writeVilla(villa);
    }
}
