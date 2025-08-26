package Basic_problems;

public class CounterUsingThreeThreads {
    public static void main(String[] args) throws InterruptedException {
        Counter counter=new Counter();

        Thread t1=new Thread(counter);
        Thread t2=new Thread(counter);
        Thread t3=new Thread(counter);
        Thread t4=new Thread(counter);
        Thread t5=new Thread(counter);
        Thread t6=new Thread(counter);
        Thread t7=new Thread(counter);
        Thread t8=new Thread(counter);
        Thread t9=new Thread(counter);
        Thread t10=new Thread(counter);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();
        t7.join();
        t8.join();
        t9.join();
        t10.join();

        System.out.println(counter.getCount());




    }
}

class Counter implements Runnable{
    int count=0;
    @Override
    public void run() {
        for(int i=0;i<1001;i++){
            inc();
        }

    }

    public synchronized void inc(){
        count++;
    }

    public int getCount() {
        return count;
    }
}
