package _01_introduction_to_java.bai_tap;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class UngDungDocSo {
    public static void main(String[] args) {
        int a,ones,tens;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap so can doc : ");
        a = scanner.nextInt();
        if (0<=a && a<=10){
            switch (a){
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
                default:
                    System.out.println("out of ability");
            }
        }
        else if (10<a && a <20){
            ones= a%10;
            switch (ones){
                case 1:
                    System.out.println("eleven");
                    break;
                case 2:
                    System.out.println("twelve");
                    break;
                case 3:
                    System.out.println("thirteen");
                    break;
                case 4:
                    System.out.println("fourteen");
                    break;
                case 5:
                    System.out.println("fifteen");
                    break;
                case 6:
                    System.out.println("sixteen");
                    break;
                case 7:
                    System.out.println("seventeen");
                    break;
                case 8:
                    System.out.println("eighteen");
                    break;
                case 9:
                    System.out.println("nineteen");
                    break;
                default:
                    System.out.println("out of ability");
            }
        }else if (20<a && a<100){
            tens=a/10;
            ones=a%10;
            switch (tens){
                case 2:
                    System.out.println("twenty ");
                    break;
                case 3:
                    System.out.println("thirty");
                    break;

            }
            switch (ones){
                case 1:
                    System.out.println(" one");
                    break;
            }
        }
    }
}
