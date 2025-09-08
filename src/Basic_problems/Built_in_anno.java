package Basic_problems;

/**
 * @author mahmudkhonusmonov
 * Identify and describe the purpose of at least three
 * built-in Java annotations.
 */
public class Built_in_anno {
    public static void main(String[] args) {
        MyAnnos.getText();
    }
}

class MyAnnos{
    @SuppressWarnings("unused")
    private int temporaryCounter;

    public static void getText(){
        System.out.println("hi");
    }


}
