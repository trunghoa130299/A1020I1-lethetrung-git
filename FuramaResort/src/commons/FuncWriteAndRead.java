package commons;

import models.Customer;
import models.House;
import models.Room;
import models.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FuncWriteAndRead {
    public static void writeVilla(Villa villa) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("src\\data\\villa.csv", true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(villa.getId() + "," + villa.getName() + "," + villa.getArea() +
                    "," + villa.getAmount() + "," + villa.getCost() + "," + villa
                    .getRentalType() + "," + villa.getStandardRoom() + "," + villa.getOther() + "," + villa.getAreaLake() + "," +
                    villa.getNumberOfFloors());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeHouse(House house) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("src\\data\\house.csv", true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(house.getId() + "," + house.getName() + "," + house.getArea() +
                    "," + house.getAmount() + "," + house.getCost() + "," + house
                    .getRentalType() + "," + house.getStandardRoom() + "," + house.getOther() + "," +
                    house.getNumberOfFloors());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeRoom(Room room) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("src\\data\\room.csv", true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(room.getId() + "," + room.getName() + "," + room.getArea() +
                    "," + room.getAmount() + "," + room.getCost() + "," + room
                    .getRentalType() + "," + room.getFreeService());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Villa> readVilla() {
        ArrayList<Villa> listVilla = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("src\\data\\villa.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] array = null;
            while ((line = bufferedReader.readLine()) != null) {
                array = line.split(",");
                Villa villa = new Villa(array[0], array[1], Double.parseDouble(array[2]), Integer.parseInt(array[3]),
                        Integer.parseInt(array[4]), Integer.parseInt(array[5]), array[6], array[7],
                        Double.parseDouble(array[8]), Integer.parseInt(array[9]));
                listVilla.add(villa);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listVilla;
    }

    public static ArrayList<House> readHouse() {
        ArrayList<House> listHouse = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("src\\data\\house.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] array = null;
            while ((line = bufferedReader.readLine()) != null) {
                array = line.split(",");
                House house = new House(array[0], array[1], Double.parseDouble(array[2]), Integer.parseInt(array[3]),
                        Integer.parseInt(array[4]), Integer.parseInt(array[5]), array[6], array[7],
                        Integer.parseInt(array[8]));
                listHouse.add(house);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listHouse;
    }

    public static ArrayList<Room> readRoom() {
        ArrayList<Room> listRoom = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("src\\data\\room.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] array = null;
            while ((line = bufferedReader.readLine()) != null) {
                array = line.split(",");
                Room room = new Room(array[0], array[1], Double.parseDouble(array[2]), Integer.parseInt(array[3]),
                        Integer.parseInt(array[4]), Integer.parseInt(array[5]), array[6]);
                listRoom.add(room);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listRoom;
    }

    public static  void showRoom() {
        ArrayList<Room> listRoom = readRoom();
        for (Room r : listRoom) {
            System.out.println(r.showInfo());
        }
    }

    public static void showVilla() {
        ArrayList<Villa> listVilla = readVilla();
        for (Villa v : listVilla) {
            System.out.println(v.showInfo());
        }
    }

    public static void showHouse() {
        ArrayList<House> listHouse = readHouse();
        for (House h : listHouse) {
            System.out.println(h.showInfo());
        }
    }


    //    Customer
    public static void writeCustomer(Customer customer) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("src\\data\\customer.csv", true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(customer.getNameCustomer() + "," + customer.getDayOfBirth() + "," + customer.getGender() +
                    "," + customer.getCmnd() + "," + customer.getSdt() + "," + customer
                    .getEmail() + "," + customer.getTypeOfCustomer() + "," + customer.getAddress());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Customer> readCustomer() {
        ArrayList<Customer> listCustomer = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("src\\data\\customer.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] array = null;
            while ((line = bufferedReader.readLine()) != null) {
                array = line.split(",");
                Customer customer = new Customer(array[0], array[1], array[2], array[3],
                        Integer.parseInt(array[4]), array[5], array[6], array[7]);
                listCustomer.add(customer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listCustomer;
    }

    public static void showInformationCustomer() {
        ArrayList<Customer> listCustomer = readCustomer();
        Collections.sort(listCustomer, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                if (o2.getNameCustomer().compareTo(o1.getNameCustomer()) != 0) {
                    return o1.getNameCustomer().compareTo(o2.getNameCustomer());
                } else {
                    int yearO1 = Integer.parseInt(o1.getDayOfBirth().substring(6, 10));
                    int yearO2 = Integer.parseInt(o2.getDayOfBirth().substring(6, 10));
                    return yearO1 - yearO2;
                }
            }
        });
        System.out.println("Danh sách customer : ");
        for (Customer customer : listCustomer) {
            System.out.println(customer.showInfo());
        }
    }


}
