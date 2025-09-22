package Basic_problems;

public class OddEvenThread {
    public static void main(String[] args) throws InterruptedException {
        CounterThread counter = new CounterThread(1, 20);

        Thread t1 = new Thread(() -> counter.printEven());
        Thread t2 = new Thread(() -> counter.printOdd());

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}

class CounterThread {
    private int count;
    private final int max;

    public CounterThread(int start, int max) {
        this.count = start;
        this.max = max;
    }

    public synchronized void printEven() {
        while (count <= max) {
            while (count % 2 != 0 && count <= max) {
                try { wait(); } catch (InterruptedException e) {}
            }
            if (count > max) break;
            System.out.println("Even " + count);
            count++;
            notify();
        }
    }

    public synchronized void printOdd() {
        while (count <= max) {
            while (count % 2 == 0 && count <= max ) {
                try { wait(); } catch (InterruptedException e) {}
            }
            if (count > max) break;
            System.out.println("Odd " + count);
            count++;
            notify();
        }
    }
}