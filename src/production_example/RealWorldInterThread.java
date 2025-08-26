package production_example;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class ApiFetcher implements Runnable {
    private final BlockingQueue<String> queue;

    ApiFetcher(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        int count = 0;
        while (true) {
            try {
                String data = "API_DATA_" + (++count);
                queue.put(data);
                System.out.println("Fetched: " + data);
                Thread.sleep(1000); // simulate network delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}

class DatabaseWriter implements Runnable {
    private final BlockingQueue<String> queue;

    DatabaseWriter(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String data = queue.take();
                System.out.println("Writing to DB: " + data);
                Thread.sleep(500); // simulate db write time
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}

public class RealWorldInterThread {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new LinkedBlockingQueue<>(10);

        Thread fetcher = new Thread(new ApiFetcher(queue));
        Thread writer = new Thread(new DatabaseWriter(queue));

        fetcher.start();
        writer.start();
    }
}