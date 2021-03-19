package commons;

import models.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeMap {
    public static ArrayList<Employee> readEmployee() {
        ArrayList<Employee> listEmployee= new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("src\\data\\Employee.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] array = null;
            while ((line = bufferedReader.readLine()) != null) {
                array = line.split(",");
                Employee employee = new Employee(array[0], Integer.parseInt(array[1]),array[2]);
                listEmployee.add(employee);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listEmployee;
    }
    public static void showEmployee(){
        List<Employee> list = readEmployee();
        Map<Integer, String> listMap =  new HashMap<>();
        listMap.put(1, list.get(0).getNameEmployee());
        listMap.put(2, list.get(1).getNameEmployee());
        listMap.put(3, list.get(2).getNameEmployee());
        listMap.put(4, list.get(3).getNameEmployee());
        listMap.put(5, list.get(4).getNameEmployee());
        listMap.put(6, list.get(5).getNameEmployee());
        listMap.put(7, list.get(6).getNameEmployee());
        listMap.put(8, list.get(7).getNameEmployee());
        listMap.put(9, list.get(8).getNameEmployee());
        listMap.put(10, list.get(9).getNameEmployee());
        for (Map.Entry<Integer, String> entry: listMap.entrySet()){
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }

}
