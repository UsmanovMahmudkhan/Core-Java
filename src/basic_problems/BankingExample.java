package basic_problems;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mahmudkhonusmonov
 * Write a Java programming to create a banking system with three classes
 * - Bank, Account, SavingsAccount, and CurrentAccount.
 * The bank should have a list of accounts and methods for adding them.
 * Accounts should be an interface with methods
 * to deposit, withdraw, calculate interest, and view balances.
 * SavingsAccount and CurrentAccount should implement the Account interface and
 * have their own unique methods.
 */

public class BankingExample {
    public static void main(String[] args) {

        Bank bank1=new Bank("khan","usmanov",12000);
        SavingsAccount savingsAccount=new SavingsAccount(bank1);
        savingsAccount.deposit(18000);
        System.out.println(savingsAccount.viewBalance());
        double myInterest=savingsAccount.interestRate(1000,10,75);
        System.out.println(myInterest);
        bank1.getAll();


    }
}

interface Account{
    double deposit(double depositMoney);
    double withdraw(double withdrawMoney);
    double interestRate(double moneyToPut,int year,int rate);
    double viewBalance();
}

class Bank{
    String name;
    String username;
    double initialBalance;
    List<Account>allAccounts=new ArrayList<>();

    public Bank(String name, String username, double initialBalance) {
        this.name = name;
        this.username = username;
        this.initialBalance = initialBalance;
    }

    public void addAccount(Account account){
        allAccounts.add(account);
    }

    public void getAll(){
        for(Account account :allAccounts){
            System.out.println(account);
        }
    }

}

class SavingsAccount implements Account{

    Bank bank;

    public SavingsAccount(Bank bank) {
        this.bank = bank;
        bank.addAccount(this);
    }

    @Override
    public double deposit(double depositMoney) {
        return bank.initialBalance+=depositMoney;
    }

    @Override
    public double withdraw(double withdrawMoney) {
        return bank.initialBalance-=withdrawMoney;
    }

    @Override
    public double interestRate(double moneyToPut, int year, int rate) {
        return (moneyToPut*year*rate)/100;
    }

    @Override
    public double viewBalance() {
        return bank.initialBalance;
    }

    @Override
    public String toString() {
        return "SavingsAccount: " +bank.name+
                " username: " + bank.username +
                " balance:" +bank.initialBalance;
    }
}

class CurrentAccount implements Account{

    Bank bank;

    public CurrentAccount(Bank bank) {
        this.bank = bank;
    }

    @Override
    public double deposit(double depositMoney) {
        return bank.initialBalance+=depositMoney;
    }

    @Override
    public double withdraw(double withdrawMoney) {
        return bank.initialBalance-=withdrawMoney;
    }

    @Override
    public double interestRate(double moneyToPut, int year, int rate) {
        return 0;
    }

    @Override
    public double viewBalance() {
        return bank.initialBalance;
    }
}


