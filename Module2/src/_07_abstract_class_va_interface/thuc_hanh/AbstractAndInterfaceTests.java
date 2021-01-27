package _07_abstract_class_va_interface.thuc_hanh;

import _07_abstract_class_va_interface.thuc_hanh.animal.Animal;
import _07_abstract_class_va_interface.thuc_hanh.animal.Chicken;
import _07_abstract_class_va_interface.thuc_hanh.animal.Tiger;
import _07_abstract_class_va_interface.thuc_hanh.edible.Edible;
import _07_abstract_class_va_interface.thuc_hanh.fruit.Apple;
import _07_abstract_class_va_interface.thuc_hanh.fruit.Fruit;
import _07_abstract_class_va_interface.thuc_hanh.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());;

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
