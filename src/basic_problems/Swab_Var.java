package basic_problems;

import java.util.Scanner;

/**
 * Write a Java program to swap two variables.
 */

public class Swab_Var {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number for X: ");
        int x= sc.nextInt();
        System.out.println("Enter number for Y: ");
        int y= sc.nextInt();
        System.out.println("X: "+x+"\nY: "+y+"\nSwapping them :");
        int temp=x;
        x=y;
        y=temp;
        System.out.println("X: "+x+"\nY: "+y+"\nSwapping them :");
    }
}
