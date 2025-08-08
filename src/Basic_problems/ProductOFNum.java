package Basic_problems;

import java.util.Scanner;

public class ProductOFNum {
    /**
     * Write a Java program that takes two numbers as input and displays the product of two numbers.
     * Test Data:
     * Input first number: 25
     * Input second number: 5
     * Expected Output :
     * 25 x 5 = 125
     */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num= sc.nextInt();
        System.out.println("Enter second number: ");
        int num2= sc.nextInt();
        System.out.println("Result: "+num+"x"+num2+"="+num2*num);
    }
}
