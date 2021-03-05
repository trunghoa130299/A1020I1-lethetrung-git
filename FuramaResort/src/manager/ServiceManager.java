package manager;

import commons.FuncWriteAndRead;
import models.House;
import models.Room;
import models.Villa;

import java.util.Scanner;

public class ServiceManager {
    Scanner scanner = new Scanner(System.in);
    public void addVilla(){
        Villa villa = new Villa();
        System.out.println("Nhap ID :");
        villa.setId(scanner.nextLine());
        System.out.println("Nhap ten :");
        villa.setName(scanner.nextLine());
        System.out.println("Nhap area :");
        villa.setArea(scanner.nextDouble());
        System.out.println("Nhap amount : ");
        villa.setAmount(scanner.nextInt());
        System.out.println("Nhap cost : ");
        villa.setCost(scanner.nextInt());
        System.out.println("Nhap rentaltype : ");
        villa.setRentalType(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Nhap standardroom : ");
        villa.setStandardRoom(scanner.nextLine());
        System.out.println("Nhap other : ");
        villa.setOther(scanner.nextLine());
        System.out.println("Nhap arealake : ");
        villa.setAreaLake(scanner.nextDouble());
        System.out.println("Nhap numberoffloor: ");
        villa.setNumberOfFloors(scanner.nextInt());
        scanner.nextLine();
        FuncWriteAndRead.writeVilla(villa);
    }
    public void addHouse(){
        House house = new House();
        System.out.println("Nhap ID :");
        house.setId(scanner.nextLine());
        System.out.println("Nhap ten :");
        house.setName(scanner.nextLine());
        System.out.println("Nhap area :");
        house.setArea(scanner.nextDouble());
        System.out.println("Nhap amount : ");
        house.setAmount(scanner.nextInt());
        System.out.println("Nhap cost : ");
        house.setCost(scanner.nextInt());
        System.out.println("Nhap rentaltype : ");
        house.setRentalType(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Nhap standardroom : ");
        house.setStandardRoom(scanner.nextLine());
        System.out.println("Nhap other : ");
        house.setOther(scanner.nextLine());
        System.out.println("Nhap numberoffloor: ");
        house.setNumberOfFloors(scanner.nextInt());
        scanner.nextLine();
        FuncWriteAndRead.writeHouse(house);
    }
    public void addRoom(){
        Room room = new Room();
        System.out.println("Nhap ID :");
        room.setId(scanner.nextLine());
        System.out.println("Nhap ten :");
        room.setName(scanner.nextLine());
        System.out.println("Nhap area :");
        room.setArea(scanner.nextDouble());
        System.out.println("Nhap amount : ");
        room.setAmount(scanner.nextInt());
        System.out.println("Nhap cost : ");
        room.setCost(scanner.nextInt());
        System.out.println("Nhap rentaltype : ");
        room.setRentalType(scanner.nextInt());
        scanner.nextLine();
        System.out.println("nhap dich vu mien phi ");
        room.setFreeService(scanner.nextLine());
        FuncWriteAndRead.writeRoom(room);
    }
}
