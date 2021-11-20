package net.kaupenjoe.banking;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bank {
    private String name;
    private List<Account> accounts;
    public static final int MAX_WITHDRAW = 500;

    private final int MIN_INITIAL_DEPOSIT = 150;

    public Bank(String name) {
        this.name = name;
        accounts = new ArrayList<>();
    }

    public boolean withdrawAmount(int amount, Person person) {
        if(getAccountByPerson(person).getBalance() - amount <= -MAX_WITHDRAW) {
            System.out.println("Cannot withdraw over the limit!");
            return false;
        }

        getAccountByPerson(person).withdrawAmount(amount);
        return true;
    }

    public boolean openBankAccount(Person person, int initialDeposit) {
        boolean bankOpened = canBankAccount(person, initialDeposit);

        if(bankOpened) {
            accounts.add(new Account(getRandomId(), initialDeposit, person));
        }

        return bankOpened;
    }

    public Account getAccountByPerson(Person person) {
        for (Account account : accounts) {
            if(account.isAccountHolder(person)) {
                return account;
            }
        }

        return null;
    }

    private String getRandomId() {
        int id =  new Random().nextInt(4124124);
        return this.name.charAt(0) + ":" + id;
    }

    private boolean canBankAccount(Person person, int initialDeposit) {
        boolean bankOpened = false;
        if(!person.isOlderThan(16)) {
            System.out.println(person.getFullName() + " is not old enough to open a Bank Account!");
        } else {
            bankOpened = true;
        }

        if(initialDeposit < MIN_INITIAL_DEPOSIT) {
            System.out.println("The Deposit of " + initialDeposit + " is not enough. Need at least " + MIN_INITIAL_DEPOSIT);
        } else {
            bankOpened = true;
        }


        return bankOpened;
    }
}
