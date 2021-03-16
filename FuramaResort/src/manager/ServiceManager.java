package manager;

import commons.FuncWriteAndRead;
import commons.ValidateService;
import models.House;
import models.Room;
import models.Villa;

import java.util.Scanner;

public class ServiceManager {
    Scanner scanner = new Scanner(System.in);
    public void addVilla(){
        Villa villa = new Villa();
        boolean check = true;
        System.out.println("Nhap ID :");
        String id;
        do {
            id = scanner.nextLine();
            if (ValidateService.checkIDVilla(id)){
                villa.setId(id);
                break;
            }else {
                System.out.println("nhập lại ");
            }

        }while (check);
        System.out.println("Nhap ten : ");
        String name = scanner.nextLine();
        villa.setName(name);
        System.out.println("Nhap area :");
        Double area ;
        do {
            area = scanner.nextDouble();
            if (ValidateService.checkArea(area)){
                villa.setArea(area);
                break;
            }else {
                System.out.println("Nhập lại ");
            }
        }while (check);
        System.out.println("Nhap amount : ");
        int amount;
        do {
            amount = scanner.nextInt();
            if (ValidateService.checkAmount(amount)){
                villa.setAmount(amount);
                break;
            }else {
                System.out.println("Nhập lại ");
            }
        }while (check);
        System.out.println("Nhap cost : ");
        int cost;
        do {
            cost=scanner.nextInt();
            if (ValidateService.checkCost(cost)){
                villa.setCost(cost);
                break;
            }else {
                System.out.println("Nhập Lại : ");
            }
        }while (check);
        System.out.println("Nhap rentaltype : ");
        villa.setRentalType(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Nhap standardroom : ");
        villa.setStandardRoom(scanner.nextLine());
        System.out.println("Nhap other : ");
        villa.setOther(scanner.nextLine());
        System.out.println("Nhap arealake : ");
        Double areaLake ;
        do {
            areaLake = scanner.nextDouble();
            if (ValidateService.checkArea(areaLake)){
                villa.setAreaLake(areaLake);
                break;
            }else {
                System.out.println("Nhập lại ");
            }
        }while (check);
        System.out.println("Nhap numberoffloor: ");
        int numberFloor ;
        do {
            numberFloor = scanner.nextInt();
            if (ValidateService.checkNumberOfFloor(numberFloor)){
                villa.setNumberOfFloors(numberFloor);
                break;
            }else {
                System.out.println("Nhập lại ");
            }
        }while (check);
        FuncWriteAndRead.writeVilla(villa);
    }
    public void addHouse(){
        House house = new House();
        boolean check= true;
        System.out.println("Nhap ID :");
        String id;
        do {
            id = scanner.nextLine();
            if (ValidateService.checkIDHouse(id)){
                house.setId(id);
                break;
            }else {
                System.out.println("nhập lại ");
            }

        }while (check);
        System.out.println("Nhap ten :");
        house.setName(scanner.nextLine());
        System.out.println("Nhap area :");
        Double area ;
        do {
            area = scanner.nextDouble();
            if (ValidateService.checkArea(area)){
                house.setArea(area);
                break;
            }else {
                System.out.println("Nhập lại ");
            }
        }while (check);
        System.out.println("Nhap amount : ");
        int amount;
        do {
            amount = scanner.nextInt();
            if (ValidateService.checkAmount(amount)){
                house.setAmount(amount);
                break;
            }else {
                System.out.println("Nhập lại ");
            }
        }while (check);
        System.out.println("Nhap cost : ");
        int cost;
        do {
            cost=scanner.nextInt();
            if (ValidateService.checkCost(cost)){
                house.setCost(cost);
                break;
            }else {
                System.out.println("Nhập Lại : ");
            }
        }while (check);
        System.out.println("Nhap rentaltype : ");
        house.setRentalType(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Nhap standardroom : ");
        house.setStandardRoom(scanner.nextLine());
        System.out.println("Nhap other : ");
        house.setOther(scanner.nextLine());
        System.out.println("Nhap numberoffloor: ");
        int numberFloor ;
        do {
            numberFloor = scanner.nextInt();
            if (ValidateService.checkNumberOfFloor(numberFloor)){
                house.setNumberOfFloors(numberFloor);
                break;
            }else {
                System.out.println("Nhập lại ");
            }
        }while (check);
        FuncWriteAndRead.writeHouse(house);
    }
    public void addRoom(){
        Room room = new Room();
        boolean check = true;
        System.out.println("Nhap ID :");
        String id;
        do {
            id = scanner.nextLine();
            if (ValidateService.checkIDRoom(id)){
                room.setId(id);
                break;
            }else {
                System.out.println("nhập lại ");
            }

        }while (check);
        System.out.println("Nhap ten :");
        room.setName(scanner.nextLine());
        System.out.println("Nhap area :");
        Double area ;
        do {
            area = scanner.nextDouble();
            if (ValidateService.checkArea(area)){
                room.setArea(area);
                break;
            }else {
                System.out.println("Nhập lại ");
            }
        }while (check);
        System.out.println("Nhap amount : ");
        int amount;
        do {
            amount = scanner.nextInt();
            if (ValidateService.checkAmount(amount)){
                room.setAmount(amount);
                break;
            }else {
                System.out.println("Nhập lại ");
            }
        }while (check);
        System.out.println("Nhap cost : ");
        int cost;
        do {
            cost=scanner.nextInt();
            if (ValidateService.checkCost(cost)){
                room.setCost(cost);
                break;
            }else {
                System.out.println("Nhập Lại : ");
            }
        }while (check);
        System.out.println("Nhap rentaltype : ");
        room.setRentalType(scanner.nextInt());
        scanner.nextLine();
        System.out.println("nhap dich vu mien phi ");
        String freeService;
        do {
            freeService = scanner.nextLine();
            if (ValidateService.checkOtherRoom(freeService)){
                room.setFreeService(freeService);
                break;
            }else {
                System.out.println("Nhập lại ");
            }
        }while (check);
        FuncWriteAndRead.writeRoom(room);
    }
}
