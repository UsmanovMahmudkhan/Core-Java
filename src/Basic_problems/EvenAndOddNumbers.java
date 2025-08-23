package Basic_problems;

public class EvenAndOddNumbers {
    public static void main(String[] args) throws Exception {
        EvenThread even=new EvenThread("Even Numbers");
        OddThread odd=new OddThread("Odd Numbers: ");

        even.even.start();
        even.even.join();

        odd.odd.start();
        odd.odd.join();

        System.out.println("Finish");


    }
}

class EvenThread implements Runnable{
    String name;
    Thread even ;

    public EvenThread(String name) {
        this.name = name;
        even=new Thread(this,name);
    }

    @Override
    public void run() {
        for(int i=1;i<=20;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
           // System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().isAlive());
            if(i%2==0){
                System.out.println("Even Thread: "+i);
            }
        }
    }
}

class OddThread implements Runnable{
    String name;
    Thread odd ;

    public OddThread(String name) {
        this.name = name;
        odd=new Thread(this,name);
    }
    @Override
    public void run() {
        for(int i=1;i<=20;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
           // System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().isAlive());
            if(i%2!=0){
                System.out.println("Odd Thread: "+i);
            }
        }
    }
}
