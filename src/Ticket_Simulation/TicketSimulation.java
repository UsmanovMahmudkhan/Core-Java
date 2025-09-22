package Ticket_Simulation;

import java.util.concurrent.ThreadLocalRandom;

public class TicketSimulation {
    public static void main(String[] args) throws InterruptedException {
        Customers customers = new Customers();

        Thread[] threads = new Thread[50];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(customers, "Customer-" + (i + 1));
            threads[i].start();
        }

        for (Thread t : threads) {
            t.join();
        }
    }
}

class Customers implements Runnable {
    private int max_ticket = 100;

    @Override
    public void run() {
        int rand = ThreadLocalRandom.current().nextInt(1, 6);
        try {
            Thread.sleep(ThreadLocalRandom.current().nextInt(500, 1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        int booked = book(rand);
        System.out.println(Thread.currentThread().getName() + " booked " + booked +
                " ticket(s), remaining: " + max_ticket);
    }

    synchronized int book(int requestedTickets) {
        if (max_ticket <= 0) return 0;

        int ticketsToBook = Math.min(requestedTickets, max_ticket);
        max_ticket -= ticketsToBook;
        return ticketsToBook;
    }
}