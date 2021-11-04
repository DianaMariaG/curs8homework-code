package ro.fasttrackit.curs8homework.food;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        (new Company(new Kfc(10))).sendFoodToEmployees();
        (new Company(new McDonalds(5))).sendFoodToEmployees();
    }
}
