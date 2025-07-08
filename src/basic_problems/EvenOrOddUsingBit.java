package basic_problems;

public class EvenOrOddUsingBit {
    public static void main(String[] args) {
        int x=117;
        if((x&1)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
