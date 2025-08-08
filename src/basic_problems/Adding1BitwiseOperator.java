package Basic_problems;

public class Adding1BitwiseOperator {
    /**
     * Add 1 to a Number Using Bitwise Operators Only
     * Input: 5
     * Output: 6
     *
     */
    public static void main(String[] args) {
        int x = 5;
        int m = 1;
        while ((x & m) != 0) {
            x = x ^ m;
            m <<= 1;
        }
        x = x ^ m;
        System.out.println(x);
    }

}
