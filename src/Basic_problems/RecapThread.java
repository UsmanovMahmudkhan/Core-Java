package Basic_problems;

public class RecapThread {
    public static void main(String[] args) {
        RecCounter rec = new RecCounter();
        Thread t1 = new Thread(rec, "EvenThread");
        Thread t2 = new Thread(rec, "OddThread");

        t1.start();
        t2.start();
    }
}

class RecCounter implements Runnable {
    private int count = 0;

    @Override
    public void run() {
        try {
            counter();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void counter() throws InterruptedException {
        while (count < 100) {
            count++;
            if (count % 2 == 0 && Thread.currentThread().getName().equals("EvenThread")) {
                System.out.println("Even: " + count);
                notifyAll();
                wait();
                Thread.sleep(2000);
            } else if (count % 2 != 0 && Thread.currentThread().getName().equals("OddThread")) {
                System.out.println("Odd: " + count);
                notifyAll();
                wait();
                Thread.sleep(2000);
            }
        }
    }
}