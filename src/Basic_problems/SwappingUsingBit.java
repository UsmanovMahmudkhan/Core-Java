package Basic_problems;

public class SwappingUsingBit {
    /**
     Swap two numbers without using a temporary variable.
     Example:
     Input: a = 5, b = 9
     Output: a = 9, b = 5
     */
    public static void main(String[] args) {
        int a=5,b=9;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a: "+a);
        System.out.println("b: "+b);

    }

}
