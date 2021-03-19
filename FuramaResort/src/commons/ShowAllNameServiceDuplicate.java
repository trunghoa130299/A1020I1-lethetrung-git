package commons;

import models.House;
import models.Room;
import models.Villa;


import java.util.List;
import java.util.TreeSet;

public class ShowAllNameServiceDuplicate {
    public static void showNameVillaDuplicate() {
        List<Villa> list = FuncWriteAndRead.readVilla();
        TreeSet<Villa> treeSetVilla = new TreeSet<>(list);
        for (Villa v : treeSetVilla) {
            System.out.println(v);
        }
    }

    public static void showNameHouseDuplicate() {
        List<House> list = FuncWriteAndRead.readHouse();
        TreeSet<House> treeSetHouse = new TreeSet<>(list);
        for (House v : treeSetHouse) {
            System.out.println(v);
        }
    }

    public static void showNameRoomDuplicate() {
        List<Room> list = FuncWriteAndRead.readRoom();
        TreeSet<Room> treeSetVilla = new TreeSet<>(list);
        for (Room v : treeSetVilla) {
            System.out.println(v);
        }
    }
}
