package ro.fasttrackit.curs8homework.bank;

import ro.fasttrackit.curs8homework.bank.Bank;

public class Customer {
    private Bank bank;

    public Customer(Bank bank){
        this.bank = bank;
    }

    public String withdrawMoney(int sum){
        return this.bank.withdraw(sum);
    }

    public String depositMoney(int sum){
        return this.bank.deposit(sum);

    }
}
