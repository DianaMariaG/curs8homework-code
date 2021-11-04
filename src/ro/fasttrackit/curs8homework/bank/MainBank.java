package ro.fasttrackit.curs8homework.bank;

import ro.fasttrackit.curs8homework.bank.Bank;

public class MainBank {
    public MainBank(){
    }

    public static void main(String[] args) {
        BT bt = new BT();
        Customer customer1 = new Customer(bt);
        System.out.println(customer1.depositMoney(250));

        Bank brd = new BRD(); //care e diferenta fata de linia 10?
        Customer customer2 = new Customer(brd);
        System.out.println(customer2.withdrawMoney(300));

        ING ing = new ING();
        Customer customer3 = new Customer(ing);
        System.out.println(customer3.depositMoney(100));
        System.out.println(customer3.withdrawMoney(200));
    }
}
