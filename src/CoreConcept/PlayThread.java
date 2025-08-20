package CoreConcept;

public class PlayThread {
    public static void main(String[] args) throws InterruptedException {

        MyThread myThread=new MyThread();
        for(int i=0;i<8;i++){
            Thread my1=new Thread(myThread);
            Thread.sleep(2000);
            //my1.wait();
            System.out.println(my1.getName()+" "+i);
        }
    }
}

class MyThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Fuck you");
    }
}
