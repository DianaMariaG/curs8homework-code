package ro.fasttrackit.curs8homework.interfaces.food;

import java.io.PrintStream;

public class Company {
    private FoodProvider foodProvider;

    public Company(FoodProvider foodProvider) {
        this.foodProvider = foodProvider;
    }

    public void sendFoodToEmployees() {
        PrintStream var10000 = System.out;
        String var10001 = this.foodProvider.deliverFood();
        var10000.println("Sending food " + var10001 + " " + this.foodProvider.deliverQuantity());
    }
}