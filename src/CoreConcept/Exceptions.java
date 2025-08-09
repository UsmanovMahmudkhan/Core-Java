package CoreConcept;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1= sc.nextInt();
        System.out.println("Enter second number: ");
        int num2= sc.nextInt();
        try{
            System.out.println(num1/num2);
        }
        catch (ArithmeticException exception){
            System.out.println("cant devide it");
        }
        //System.out.println(num2/num1);
    }
}
