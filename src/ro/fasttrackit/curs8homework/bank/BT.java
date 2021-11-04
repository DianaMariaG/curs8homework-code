package ro.fasttrackit.curs8homework.bank;

public class BT implements Bank {
    private double amount = 0;
    private static double COMISION = 0.07;

    @Override
    public String withdraw(int sum) {
        if (sum <= amount) {
            amount = amount - sum - (sum * COMISION);
            return "You have withdrawn " + sum + " RON";
        } else {
            return "You have insufficient funds for this withdrawal!";
        }
    }


    @Override
    public String deposit(int sum) {
        amount = amount + sum + (sum * COMISION);
        return "You have deposited " + sum + " RON";
    }
}