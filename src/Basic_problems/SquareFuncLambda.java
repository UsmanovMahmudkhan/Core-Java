package Basic_problems;

import java.util.Scanner;

/**
 * Square Function: Create a functional interface MyNumber with one method getValue(int x).
 * Use a lambda to return the square of x.
 */
public class SquareFuncLambda {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input= scanner.nextInt();
        MyNumber number= Math::sqrt;
        System.out.println(number.getValue(input));
    }
}

interface MyNumber{
    double getValue(int x);
}
