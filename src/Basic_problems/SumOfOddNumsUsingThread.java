package Basic_problems;

public class SumOfOddNumsUsingThread {
    public static void main(String[] args) throws InterruptedException {
        Odd_numbers odd=new Odd_numbers(4);
        Odd_numbers odd2=new Odd_numbers(20);


        Thread thread=new Thread(odd,"Odd Number");
        Thread thread2=new Thread(odd2,"Odd Number");

        thread.start();
        thread2.start();


        thread.join();
        thread2.join();

        System.out.println(odd.getSum());
        System.out.println(odd2.getSum());
    }
}

class Odd_numbers implements Runnable{

    int limit;
    int sum=0;

    public Odd_numbers(int limit) {
        this.limit = limit;
    }

    @Override
    public  void run() {

        {
        for(int i=1;i<=limit;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
    }
    }

    public int getSum(){
        return sum;
    }
}
