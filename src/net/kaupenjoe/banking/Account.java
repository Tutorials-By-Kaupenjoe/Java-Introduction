package net.kaupenjoe.banking;

public class Account {
    private int balance;
    private String accountID;
    private Person accountHolder;

    public Account(String id, int balance, Person person) {
        this.accountID = id;
        this.balance = balance;
        this.accountHolder = person;
    }

    protected void depositAmount(int amount) {
        balance += amount;
    }

    protected int withdrawAmount(int amount) {
        balance -= amount;
        return amount;
    }

    public int getBalance() {
        return balance;
    }

    public boolean isAccountId(String id) {
        return this.accountID.equals(id);
    }

    public boolean isAccountHolder(Person person) {
        return accountHolder == person;
    }
}
