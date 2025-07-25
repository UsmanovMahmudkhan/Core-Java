public class ReturnObjects {

    public static void main(String[] args) {
        Object test=new Object(10);
        Object test2= test.incByTen();
        System.out.println(test2.input);
    }
}

class Object{
    int input;

    public Object(int input) {
        this.input = input;
    }

    public Object incByTen(){
        return new Object(input+10);
    }

}
