package Basic_problems;

/**
 *  a recursive method that calculates the sum of all digits of every number from n down to 1
 *  11  38
 * 10  37
 * 9  36
 * ...
 * 2  11
 * 1  10
 * 1  9
 * 1  8
 * ...
 * 1  1
 */
public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(38));
    }
    static int sum(int n){
        int tens=n%10;
        int last=n/10;
        if(n==0){
            return 1;
        }
        else{
            System.out.println(tens+last+"  "+n);
            return tens+last+sum(n-1);
        }
    }
}
