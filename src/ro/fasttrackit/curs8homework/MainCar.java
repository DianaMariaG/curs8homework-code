package ro.fasttrackit.curs8homework;

public class MainCar {
    public MainCar() {
    }

    public static void main(String[] args) {
        System.out.println(Car.LATIME);
        Car.LATIME = 20;
        System.out.println(Car.LATIME);
        Car dacia = new Car("Dacia");
        System.out.println(Car.LATIME);
        Car opel = new Car("Opel");
        ++Car.LATIME;
        System.out.println(Car.LATIME);
        Car nullcar = null;
        System.out.println(Car.LATIME);
        System.out.println(Car.buildMessage());
    }
}