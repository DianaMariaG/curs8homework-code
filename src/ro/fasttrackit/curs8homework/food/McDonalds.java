package ro.fasttrackit.curs8homework.food;

public class McDonalds implements FoodProvider {
    private int quantity;

    public McDonalds(int qty) {
        this.quantity = qty;
    }

    public String deliverFood() {
        return "Delivering " + this.prepareFood();
    }

    private String prepareFood() {
        return "Burgers";
    }

    public int deliverQuantity() {
        return this.quantity;
    }
}
