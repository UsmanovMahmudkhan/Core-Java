import java.util.Scanner;

public class LoopExample {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter number: ");
        int x=in.nextInt();
        for (int i=1; i<=x; i++){
            System.out.println("X: "+i);
        }
    }
}
