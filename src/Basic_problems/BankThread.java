package Basic_problems;

public class BankThread {
    public static void main(String[] args) throws InterruptedException {
        BankAccount bank = new BankAccount();

        Thread t1 = new Thread(bank, "T1");
        Thread t2 = new Thread(bank, "T2");
        Thread t3 = new Thread(bank, "T3");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Final Balance: " + bank.getBalance());
    }
}

class BankAccount implements Runnable {
    private long balance = 100_000;

    @Override
    public void run() {
        deposit(2000);
        withdraw(20);
    }

    public synchronized void deposit(long amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited: +" + amount + " | Balance: " + balance);
    }

    public synchronized void withdraw(long amount) {
        balance -= amount;
        System.out.println(Thread.currentThread().getName() + " withdrew: -" + amount + " | Balance: " + balance);
    }

    public synchronized long getBalance() {
        return balance;
    }
}