package commons;

import models.Villa;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FuncWriteAndRead {
    public static void writeVilla(Villa villa){
        FileWriter fileWriter =null;
        BufferedWriter bufferedWriter =null;
        try {
            fileWriter= new FileWriter("src\\data\\villa.csv",true);
            bufferedWriter =new BufferedWriter(fileWriter);
            bufferedWriter.write(villa.getId()+","+villa.getName()+","+villa.getArea()+
                    ","+ villa.getAmount()+ ","+villa.getCost()+","+villa
            .getRentalType()+","+ villa.getStandardRoom()+","+ villa.getOther()+","+villa.getAreaLake()+","+
                    villa.getNumberOfFloors());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
