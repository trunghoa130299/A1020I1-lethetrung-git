package text.code;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainController {
    Student student = new Student();
    Scanner scanner = new Scanner(System.in);

    public void addStudent(){
        System.out.println("Nhap id ");
        student.setiD(scanner.nextLine());
        System.out.println("nhap ten ");
        student.setName(scanner.nextLine());
        System.out.println("nhap gioi tinh ");
        student.setGender(scanner.nextLine());
        System.out.println("nhap tuoi ");
        student.setAge(Integer.parseInt(scanner.nextLine()));
        WriteAndRead.Write(student);
    }
    public  void showStudent() {
        ArrayList<Student> list = WriteAndRead.read();
        for (Student s : list) {
            System.out.println(s);
        }
    }
    public static String showListStudent() {
        ArrayList<Student> listStudent = WriteAndRead.read();
        String list1 = "";
        for (int i = 0; i < listStudent.size(); i++) {
            list1 += (i + 1 + " name : " + listStudent.get(i).getName() + "\n");
        }
        return list1;
    }
    public static String showInfoStudent(Student student) {
        String list = " 1.id : " + student.getiD() + " 2.ten : " +
                student.getName() + " 3.gioi tinh : " + student.getGender() +
                " 4.tuoi : " + student.getAge() + "\n";
        return list;
    }
    public void editStudent(){
         ArrayList<Student> listStudent = WriteAndRead.read();
        System.out.println("danh sach  : " + showListStudent());
        System.out.println("plese choose : ");
        int choose = scanner.nextInt();
        scanner.nextLine();
        System.out.println("thong tin :  " + showInfoStudent(listStudent.get(choose - 1)));
        System.out.println("input choose edit : ");
        int edit = scanner.nextInt();
        scanner.nextLine();
        switch (edit) {
            case 1:
                System.out.println("edit id : ");
                listStudent.get(choose - 1).setiD(scanner.nextLine());
                break;
            case 2:
                System.out.println("edit ten : ");
                listStudent.get(choose - 1).setName(scanner.nextLine());
                break;
            case 3:
                System.out.println("edit gioi tinh : ");
                listStudent.get(choose - 1).setGender(scanner.nextLine());
                break;
            case 4:
                System.out.println("edit tuoi : ");
                listStudent.get(choose-1).setAge(Integer.parseInt(scanner.nextLine()));
                break;
            default:
                System.out.println("fail");
        }
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("src\\text\\file\\data.csv", true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(listStudent.get(choose-1).getiD() + "," +
                    listStudent.get(choose-1).getName() + "," + listStudent.get(choose-1).getGender() +
                    "," + listStudent.get(choose-1).getAge() );
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}