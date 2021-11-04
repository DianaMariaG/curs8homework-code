package ro.fasttrackit.curs8homework.animals;

public class MainAnimals {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        System.out.println("Cat says "+cat1.talk() + ", walks " +cat1.walk() + ", and eats " + cat1.eat());

        Dog dog1 = new Dog();
        System.out.println("Dog " +dog1.talk() + ", walks " +dog1.walk()+", and eats " + dog1.eat());

        Mouse mouse1 = new Mouse();
        System.out.println("Mouse says " +mouse1.talk() + ", does " +mouse1.walk()+", and eats " + mouse1.eat());

        Chicken chicken1 = new Chicken();
        System.out.println("Chicken says "+chicken1.talk() + ", " +chicken1.walk() + ", and eats " + chicken1.eat());

        Duck duck1 = new Duck();
        System.out.println("Duck says "+duck1.talk() + ", " +duck1.walk() + ", and eats " + duck1.eat());

    }
}
