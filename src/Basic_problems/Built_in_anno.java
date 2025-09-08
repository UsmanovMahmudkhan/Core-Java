package Basic_problems;

/**
 * @author mahmudkhonusmonov
 * Identify and describe the purpose of at least 2
 * built-in Java annotations.
 */
public class Built_in_anno {
    public static void main(String[] args) {
        MyAnnos.getText();
        new MyAnnos().getGreeting();

    }
}

class MyAnnos extends myAnnos2{
    @SuppressWarnings("unused")
    private int temporaryCounter;

    public static void getText(){
        System.out.println("hi");
    }

    @Override
    public void getGreeting() {
        super.getGreeting();
    }
}


class myAnnos2{
    public  void getGreeting(){
        System.out.println("Hello");
    }
}