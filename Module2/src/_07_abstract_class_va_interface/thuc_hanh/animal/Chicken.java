package _07_abstract_class_va_interface.thuc_hanh.animal;

import _07_abstract_class_va_interface.thuc_hanh.edible.Edible;

public class Chicken  extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }

}
