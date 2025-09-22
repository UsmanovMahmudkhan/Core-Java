package Basic_problems;

import java.util.TreeMap;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Create a BankAccount class with deposit and withdraw methods.
 * 	Start multiple threads trying to withdraw and deposit money simultaneously.
 * 	Make sure the account balance never goes negative
 */
public class BankThreadProblem {
    public static void main(String[] args) throws InterruptedException {
        Bank_account acc= new Bank_account();
        Thread t= new Thread(acc,"Customer-1");
        Thread t2= new Thread(acc,"Customer-2");
        t.start();
        t2.start();

        t.join();
        t2.join();
    }
}

class Bank_account implements Runnable{
    double balance=10_000.12;
    @Override
    public void run() {
        double rand;
        for(int i=0;i<100;i++){
            rand= ThreadLocalRandom.current().nextDouble(100,500);
            deposit(rand);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


            rand= ThreadLocalRandom.current().nextDouble(100,500);
            withdraw(rand);

        }


    }

    public synchronized void withdraw(double amount){
        if (balance>0 && amount>0 && balance >= amount) {
            balance -= amount;
        }
        else{
            System.out.println("cant proceed");
        }
        System.out.println(Thread.currentThread().getName()+" New "+balance+"  withdraw: "+amount);
    }

    public synchronized void deposit(double deposit){
        if(deposit>0) {
            balance += deposit;
        }
        else{
            System.out.println("deposit must greater than 0");
        }
        System.out.println(Thread.currentThread().getName() +" New "+balance+"  deposit: "+deposit);
    }
}
