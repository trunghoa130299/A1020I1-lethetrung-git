package text.code;

import java.io.*;
import java.util.ArrayList;

public class WriteAndRead {
    public static void Write(Student student){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("src\\text\\file\\data.csv", true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(student.getiD() + "," + student.getName() + "," + student.getGender() +
                    "," + student.getAge() );
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static ArrayList<Student> read(){
        ArrayList<Student> listStudent = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("src\\text\\file\\data.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] array = null;
            while ((line = bufferedReader.readLine()) != null) {
                array = line.split(",");
                Student student = new Student(array[0], array[1],array[2], Integer.parseInt(array[3]));
                listStudent.add(student);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listStudent;
    }


}
