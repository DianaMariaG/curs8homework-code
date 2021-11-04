package ro.fasttrackit.curs8homework.bank;

public class BT implements Bank {
    @Override
    public int withdraw() {
        return 600;
    }

    @Override
    public int deposit() {
        return 2000;
    }
}
