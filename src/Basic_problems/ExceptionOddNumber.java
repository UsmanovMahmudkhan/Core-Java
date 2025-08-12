package Basic_problems;


/**
 * @author mahmudkhonusmonov
 * Write a Java program to create a method
 * that takes an integer as a parameter and throws an exception
 * if the number is odd.
 */

public class ExceptionOddNumber {
    public static void main(String[] args) {
        try {
            checkEven(2);
        } catch (OddException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkEven(int number) throws OddException {
        if(number%2==0){
            System.out.println("This is even");
        }
        else{
            throw new OddException("Not acceptable");
        }
    }

    private static class OddException extends Exception {
        public OddException(String masssagge) {
            super(masssagge);
        }
    }
}


