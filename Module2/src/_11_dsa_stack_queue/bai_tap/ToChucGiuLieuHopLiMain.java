package _11_dsa_stack_queue.bai_tap;

import java.util.*;

public class ToChucGiuLieuHopLiMain {
    public static void main(String[] args) {
        Queue nu = new LinkedList<>();
        Queue nam = new LinkedList<>();
        List<Person> list = new ArrayList<>();
//        Person abc = new Person();
//        list.add(new Person("trung", "13/2/1999", "nam"));
//        list.add(new Person("khanh", "12/1/1998", "nam"));
//        list.add(new Person("mai", "12/1/1998", "nu"));
        Scanner input = new Scanner(System.in);
        System.out.println("Input number add: ");
        int number = Integer.parseInt(input.nextLine());
        for (int i = 0; i < number; i++) {
            Person person = new Person();
            System.out.println("Input Name: ");
            person.setHoTen(input.nextLine());
            System.out.println("Input Birthday: ");
            person.setNgaySinh(input.nextLine());
            System.out.println("Input gender: ");
            person.setGioiTinh(input.nextLine());
            list.add(person);
        }
        for (Person person1: list) {
           if (person1.getGioiTinh().equals("nu")){
               nu.offer(person1);
           }else {
               nam.offer(person1);
           }
        }
//        Object [] array = new Object[3];
        ArrayList<Person> arrayList= new ArrayList<>();
        for (int i = 0; i < nu.size()+nam.size(); i++) {
            if (!nu.isEmpty()){
                arrayList.add((Person) nu.poll());
            }else if (!nam.isEmpty()){
                arrayList.add((Person) nam.poll());
            }
        }
        for ( Person i : arrayList){
            System.out.println(i);
        }
    }
}
