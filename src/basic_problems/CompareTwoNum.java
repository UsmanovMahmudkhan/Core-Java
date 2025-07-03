package basic_problems;

import java.util.Scanner;

public class CompareTwoNum {
    /**
     * Write a Java program to compare two numbers.
     * Input Data:
     * Input first integer: 25
     * Input second integer: 39
     * Expected Output
     *
     * 25 != 39
     * 25 < 39
     * 25 <= 39
     */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        double num1=sc.nextDouble();
        System.out.println("Enter number: ");
        double num2=sc.nextDouble();
        if(num1!=num2 && num1<num2 && num1<=num2){
            System.out.println(num1+"!="+num2);
            System.out.println(num1+"<"+num2);
            System.out.println(num1+"<="+num2);
        }
        else {
            System.out.println(num1+">"+num2);
        }

    }
}
