package Basic_problems;

import java.lang.invoke.WrongMethodTypeException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Modify the above program so that it also handles InputMismatchException if the user enters non-numeric input.
 */
public class ModifyArifmeticExxception {
    public static void main(String[] args) {
        
        try{
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number: ");
        int num1= sc.nextInt();
        System.out.println("enter number: ");
        int num2= sc.nextInt();
        if (num2 == 0) throw new ArithmeticException("You cant devide to 0");
        System.out.println(num1/num2);
        }
        catch (ArithmeticException e) {
           throw new ArithmeticException(e.getMessage());
            }
        catch (InputMismatchException e){
            throw new InputMismatchException("Wrong input");
        }
    }
//        try{
//
//            double ans=devide(12,0);
//            System.out.println(ans);
//        }
//        catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("done");
//        }
//    }

//    public static double devide(double n1,double n2,) throws ArithmeticException,IncompatibleClassChangeError {
//        if(n2==0){
//            throw new ArithmeticException("You cant devide to 0");
//        }
//
//        return n1/n2;
//    }

}
