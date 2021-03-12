package _16_io_text_file.bai_tap.coppyfile;

import java.io.*;

public class File1 {
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter
                ("src\\_16_io_text_file\\bai_tap\\coppyfile\\file1.txt",true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Nguyen Van A " + "," + "12/3/2021");
        bufferedWriter.write("Nguyen Van B " + "," + "13/3/2021");
        bufferedWriter.close();
//
        FileReader fileReader = new FileReader("src\\_16_io_text_file\\bai_tap\\coppyfile\\file1.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line ;
        while ((line = bufferedReader.readLine()) != null) {
            FileWriter fileWriter1 = new FileWriter("src\\_16_io_text_file\\bai_tap\\coppyfile\\file2.txt",true);
            BufferedWriter bufferedReader1 = new BufferedWriter(fileWriter1);
            bufferedReader1.write(line);
            bufferedReader1.close();
        }
    }
}
