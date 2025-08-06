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

        Bank mybank=new Bank("Khan",1234,9876543,12000);
        SavingsAccount savingsAccount=new SavingsAccount(mybank);
        savingsAccount.deposit(22000);
        savingsAccount.withdraw(15000);
        savingsAccount.withdraw(1);
        System.out.println(savingsAccount.viewBalance());
        double rate=savingsAccount.calculate_interest(12000,2,33);
        System.out.println(rate);


    }
}

interface Account{
    double deposit(double depositMoney);
    double withdraw(double withdrawMoney);
    double calculate_interest(double moneyToget,int time,int rate);
    double viewBalance();

}

class Bank {

    public  String name;
    public  int password;
    public  int  cardNumber;
    public  double initialBalance;
    List<Object> myList = new ArrayList<>();

    public Bank(String name, int password, int cardNumber,double initialBalance) {
        this.name = name;
        this.password = password;
        this.cardNumber = cardNumber;
        this.initialBalance =initialBalance;
    }

    public void addInfo() {
        myList.add(name);
        myList.add(password);
        myList.add(cardNumber);
        myList.add(initialBalance);

        for(Object o:myList){
            System.out.print(o+" ");
        }
    }


}


class SavingsAccount implements Account{
    Bank bank;

    public SavingsAccount(Bank bank) {
        this.bank = bank;
    }

    @Override
    public double deposit(double depositMoney) {
        return bank.initialBalance+=depositMoney;
    }

    @Override
    public double withdraw(double withdrawMoney) {
        if(withdrawMoney>bank.initialBalance) {
            throw new RuntimeException("This is not acceptable, shit???");
        }
        return bank.initialBalance-=withdrawMoney;
    }

    @Override
    public double calculate_interest(double MoneyToPut, int time, int rate) {
        if(MoneyToPut>bank.initialBalance) {
            throw new RuntimeException("This is not acceptable, shit???");
        }
        return (MoneyToPut*rate*time)/100;
    }

    @Override
    public double viewBalance() {
        return bank.initialBalance;
    }
}

