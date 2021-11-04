package ro.fasttrackit.curs8homework.bank;

public class BRD implements Bank{
    @Override
    public int withdraw() {
        return 90;
    }

    @Override
    public int deposit() {
        return 7000;
    }
}
