package CoreConcept;

public class ThreadDemo2 {
    public static void main(String[] args) {

        Thread chef1=new Restaurant("khan");
        Thread chef2=new Restaurant("ALi");
        Thread chef3=new Restaurant("Vali");
        Thread chef4=new Restaurant("ABC");
        chef1.start();
        chef2.start();
        chef3.start();
        chef4.start();


    }
}

class Restaurant extends Thread{
    private String chef_name;

    public Restaurant(String chef_name) {
        this.chef_name = chef_name;
    }

    public void run(){
        System.out.println(Thread.currentThread().getName()+" is doing smth");
    }
}


