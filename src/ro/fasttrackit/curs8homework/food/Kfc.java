package ro.fasttrackit.curs8homework.food;

public class Kfc implements FoodProvider {
    private McDonalds mcDonalds;

    public Kfc(int qty) {
        this.mcDonalds = new McDonalds(qty + 1);
    }

    public String deliverFood() {
        return this.mcDonalds.deliverFood();
    }

    public int deliverQuantity() {
        return this.mcDonalds.deliverQuantity();
    }
}
