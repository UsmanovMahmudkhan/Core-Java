package CoreConcept;

import java.util.Scanner;

public class CheckSign {
    /**
     * Check if two integers have opposite signs.
     * Example:
     * Input: a = -3, b = 2
     * Output: true
     *
     */
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1= sc.nextInt();
        System.out.println("Enter second number: ");
        int num2= sc.nextInt();
        boolean hasOppositeSigns = (num1 ^ num2) < 0;
        System.out.println(hasOppositeSigns);

    }
}
