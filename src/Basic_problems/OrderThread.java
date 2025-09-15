package Basic_problems;

public class OrderThread {
    public static void main(String[] args) throws InterruptedException {
        Printer p = new Printer(100);
        Thread th1 = new Thread(p, "Thread1");
        Thread th2 = new Thread(p, "Thread2");
        Thread th3 = new Thread(p, "Thread3");

        th1.start();
        th2.start();
        th3.start();

        th1.join();
        th2.join();
        th3.join();
    }
}

class Printer implements Runnable {
    private int counter = 1;
    private final int max;

    public Printer(int max) {
        this.max = max;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (counter > max) break;
                System.out.println(Thread.currentThread().getName() + ": " + counter);
                counter++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                notifyAll();
                try {
                    if (counter <= max) wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}