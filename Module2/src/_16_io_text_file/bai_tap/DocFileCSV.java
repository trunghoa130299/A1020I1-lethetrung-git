package _16_io_text_file.bai_tap;

import java.io.*;

public class DocFileCSV {
        public static void Wirter(){
            try {
                FileWriter fileWriter;
                fileWriter = new FileWriter("src\\_16_io_text_file\\bai_tap\\quocgia.csv");
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write("1.0.0.0"+","+"1.0.0.255"+","+"16777216"+","+"16777471"+","+"AU"+","+"Australia");
                bufferedWriter.newLine();
                bufferedWriter.write("1.0.1.0"+","+"1.0.3.255"+","+"16777472"+","+"16778239"+","+"CN"+","+"China");
                bufferedWriter.newLine();
                bufferedWriter.write("1.0.4.0"+","+"1.0.7.255"+","+"16778240"+","+"16779263"+","+"AU"+","+"Australia");
                bufferedWriter.newLine();
                bufferedWriter.write("1.0.8.0"+","+"1.0.15.255"+","+"16779264"+","+"16781311"+","+"CN"+","+"China");
                bufferedWriter.newLine();
                bufferedWriter.write("1.0.16.0"+","+"1.0.31.255"+","+"16781312"+","+"16785407"+","+"JP"+","+"Japan");
                bufferedWriter.newLine();
                bufferedWriter.write("1.0.32.0"+","+"1.0.63.255"+","+"16785408"+","+"16793599"+","+"CN"+","+"China");
                bufferedWriter.newLine();
                bufferedWriter.write("1.0.64.0"+","+"1.0.127.255"+","+"16793600"+","+"16809983"+","+"JP"+","+"Japan");
                bufferedWriter.newLine();
                bufferedWriter.write("1.0.128.0"+","+"1.0.255.255"+","+"16809984"+","+"16842751"+","+"TH"+","+"Thailand");
                bufferedWriter.close();
            } catch ( IOException e) {
                e.printStackTrace();
            }
        }
        public static void Read(){
            try {
                FileReader fileReader = new FileReader("src\\_16_io_text_file\\bai_tap\\quocgia.csv");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line=bufferedReader.readLine())!=null){
                    System.out.println(line);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public static void main(String[] args) {
            Wirter();
            Read();
        }

}
