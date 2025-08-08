package Basic_problems;

import java.util.Scanner;

public class MultiplyUsingBit {
    /**
     * Multiply a given number by 2 using bitwise operator.
     * Example:
     * Input: n = 4
     * Output: 8
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter that damn number: ");
        int num1= sc.nextInt();
        num1<<=1;
        System.out.println(num1);
    }
}
