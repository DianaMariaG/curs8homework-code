package ro.fasttrackit.curs8homework.bank;

import ro.fasttrackit.curs8homework.bank.Bank;

public class Customer {
    private Bank bank;

    public Customer(Bank bank){
        this.bank = bank;
    }

    public String withdrawMoney(){
        return "I have withdrawn " + this.bank.withdraw() + " money";
    }

    public String depositMoney(){
        return "I have deposited " + this.bank.deposit() + " money";
    }
}
