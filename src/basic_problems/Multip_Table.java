package basic_problems;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Multip_Table {

    /**
     * Write a Java program that takes a number as input and prints its multiplication table up to 10.
     * Test Data:
     * Input a number: 8
     * Expected Output :
     * 8 x 1 = 8
     * 8 x 2 = 16
     * 8 x 3 = 24
     * ...
     * 8 x 10 = 80
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num= sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+"x"+i+"="+(num*i));
        }
    }
}
