package CoreConcept;

public class SynchronizedStatement {
    public static void main(String[] args) throws InterruptedException {
        Adder add=new Adder(0);
      //  add.increment();
      //  add.increment();
        Thread myThread=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    add.increment();
                }
            }
        });

        Thread myThread2=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    add.increment();
                }
            }
        });

        myThread.start();
        myThread2.start();


        myThread.join();
        myThread2.join();


        System.out.println(add.number);
    }
}

class Adder{
    int number;

    public Adder(int number) {
        this.number = number;
    }

    public synchronized void increment(){
        number++;
    }
}
