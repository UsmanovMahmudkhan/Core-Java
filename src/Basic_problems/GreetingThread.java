package Basic_problems;

public class GreetingThread {
    public static void main(String[] args) throws InterruptedException {
        Greeting my1=new Greeting("Hello");
        my1.myThread.start();
        Thread.sleep(1000);
        Greeting my2=new Greeting("World");
        my2.myThread.start();
        my1.myThread.join();
        my2.myThread.join();
        System.out.println("Again Hello World");
    }
}

class Greeting implements Runnable{
     String name;
     Thread myThread;

    public Greeting(String name) {
        this.name = name;
        myThread=new Thread(this,name);
    }
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(myThread.isAlive());
        System.out.println(Thread.currentThread().getName()+" : Hello World!");
    }
}
