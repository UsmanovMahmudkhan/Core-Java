package Basic_problems;

import java.lang.management.RuntimeMXBean;

public class JustRememberThread {
    public static void main(String[] args) {
        Thread thread=new Thread(new MyJustThread());
        thread.start();
    }
}

class MyJustThread implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
