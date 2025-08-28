package Basic_problems;

/**
 * Two threads alternately print PING and PONG exactly N times in correct alternating order.
 *
 * Details & constraints: Use wait()/notify() or notifyAll() on a single shared monitor. No busy-waiting. Must work for any positive N.
 *
 * Hints / tests: Test with N=5 → output sequence PING PONG PING PONG .... Consider a shared state variable indicating whose turn it is.
 */

class WorkerThread{
    public static void main(String[] args) throws Exception{
        Signal signal=new Signal();
        Thread t1=new Thread(new Ping(signal));
        Thread t2=new Thread(new Pong(signal));

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }

}

class Signal{
    boolean isSignal=true;

    public boolean isSignal() {
        return isSignal;
    }

    public void setSignal(boolean signal) {
        isSignal = signal;
    }
}

class Ping implements Runnable{

    Signal s;

    public Ping(Signal s) {
        this.s = s;
    }

    @Override
    public void run() {
        synchronized (s) {
            while(true) {
                while (s.isSignal()) {
                    try {
                        s.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                try {
                    print();
                    Thread.sleep(2000);
                    s.setSignal(true);
                    s.notify();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public  void print() throws InterruptedException {

        System.out.println("Ping "+Thread.currentThread().getName());

    }
}

class Pong implements Runnable{
    Signal s;

    public Pong(Signal s) {
        this.s = s;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (s) {
                while (!s.isSignal()) {
                    try {
                        s.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                try {
                    print();
                    Thread.sleep(2000);
                    s.setSignal(false);
                    s.notify();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public  void print() throws InterruptedException {
        System.out.println("Pong "+Thread.currentThread().getName());

    }
}