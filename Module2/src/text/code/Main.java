package text.code;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MainController  mainController = new MainController();
        while (true){
            System.out.println("1.Add New Student"+"\n"+
                    "2.Show Student" +"\n" +
                    "3.Edit");
            System.out.println("please choose : ");
            int choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose){
                case 1:
                    mainController.addStudent();
                    break;
                case 2:
                    mainController.showStudent();
                    break;
                case 3:
                    mainController.editStudent();
                    break;

            }
        }
    }
}
