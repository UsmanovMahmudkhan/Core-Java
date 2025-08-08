package Basic_problems;

import java.util.Scanner;

public class Simple_Calculator {
    /**
     * Write a program that accepts two integers and
     * a character (+, -, *, /) as input and
     * uses a switch to perform the correct operation. Print the result.
     */
    public static void main(String[] args) {
        String operation;
        int inp1,inp2;
        double result;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first value: ");
        inp1= sc.nextInt();
        System.out.println("Enter second value: ");
        inp2= sc.nextInt();
        System.out.println("Enter Operation: (+, -, *, /)");
        operation=sc.next();
        switch (operation){
            case "+":
                result=inp1+inp2;
                System.out.println(inp1+"+"+inp2+"="+result);
                break;
            case "-":
                result=inp1-inp2;
                System.out.println(inp1+"-"+inp2+"="+result);
                break;
            case "*":
                result=inp1*inp2;
                System.out.println(inp1+"*"+inp2+"="+result);
                break;
            case"/":
                switch (inp1){
                    case 0:
                        System.out.println("Wrong input!!");
                        break;
                    default:
                        result= (double) inp1 /inp2;
                        System.out.println(inp2+"/"+inp2+"="+result);
                }
            default:
                System.out.println("Write only operation symbol!!!");
        }



    }
}
