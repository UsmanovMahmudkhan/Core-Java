package Basic_problems;
public class StoringInBuffer {
    public static void main(String[] args) {
        Event e = new Event();
        Thread t = new Thread(e);
        t.start();
    }
}
class Event implements Runnable {
    private final int[] buffer = new int[5];
    private int count = 0;

    @Override
    public void run() {
        Thread producer = new Thread(() -> {
            try {
                produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }

    private synchronized void produce() throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            while (count == buffer.length) wait();
            buffer[count++] = i;
            System.out.println("Produced: " + i);
            notify();
            Thread.sleep(200);
        }
    }

    private synchronized void consume() throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            while (count == 0) wait();
            int val = buffer[--count];
            System.out.println("Consumed: " + val);
            notify();
            Thread.sleep(300);
        }
    }
}