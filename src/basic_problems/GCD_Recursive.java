package basic_problems;

/**
 * Write a Java recursive method to
 * find the greatest common divisor (GCD) of two numbers.
 */

public class GCD_Recursive {
    public static void main(String[] args) {

        System.out.println(gcd(0,18));
    }
    static int gcd(int num1,int num2){
        if(num1==0){
            return num2;
        }

        if(num2==0){
            return num1;
        }

        if(num1%num2==0){
            return num2;
        }
        return gcd(num2,num1%num2);
    }
}
