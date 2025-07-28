package basic_problems;

/**
 * Write a Java recursive method
 * to calculate the exponentiation of a number (base) raised to a power (exponent).
 * 2 ^ 5 = 2 × 2 × 2 × 2 × 2 = 32
 * Base=2 , Exponent=5
 */
 public class RecursiveExponential {
    public static void main(String[] args) {

        System.out.println(power(4,3));
    }

    static long power(int base, int exp){
        if(base==0 || exp==0){
            return 1;
        }
        return base*power(base,exp-1);

    }
 }
