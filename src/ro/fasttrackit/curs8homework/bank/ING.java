package ro.fasttrackit.curs8homework.bank;

public class ING implements Bank {
    @Override
    public int withdraw() {
        return 300;
    }

    @Override
    public int deposit() {
        return 1000;
    }
}
