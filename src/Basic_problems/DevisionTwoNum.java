package Basic_problems;

import java.util.Scanner;

public class DevisionTwoNum {
    /**
     * Write a Java program to divide two numbers and print them on the screen.
     * Test Data :
     * 50/3
     * Expected Output :
     * 16
     */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        float num1= sc.nextFloat();
        System.out.println("Enter second number: " );
        float num2= sc.nextFloat();
        if(num2==0){
            throw new RuntimeException("cant devide number!!!" +
                    "please enter valid number");
        }
        else{
            float result=num1/num2;
            System.out.println("Result: "+result);
        }
    }


}
