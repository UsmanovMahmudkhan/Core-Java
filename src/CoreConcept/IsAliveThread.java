package CoreConcept;
public class IsAliveThread implements Runnable {
    public static void main(String[] args) {
        IsAliveMultiThread myth = new IsAliveMultiThread("salom");
        myth.myThread.start();
        Thread myThread2 = new Thread(new IsAliveThread());
        myThread2.start();
    }

    @Override
    public void run() {
        for (int j = 0; j < 5; j++) {
            System.out.println(j);
        }
    }
}

class IsAliveMultiThread implements Runnable {
    String name;
    Thread myThread;

    public IsAliveMultiThread(String name) {
        this.name = name;
        myThread = new Thread(this, name);
    }

    @Override
    public void run() {
        System.out.println("Before loop: " + myThread.isAlive());
        for (int i = 0; i < 5; i++) {
            System.out.println("During loop: " + myThread.isAlive());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        System.out.println("After run: " + myThread.isAlive());
    }
}