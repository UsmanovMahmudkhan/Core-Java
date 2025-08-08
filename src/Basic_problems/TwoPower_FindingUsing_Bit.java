package Basic_problems;

import java.util.Scanner;

public class TwoPower_FindingUsing_Bit {
    /**
     * Return true if n is a power of two.
     * Example:
     * Input: n = 16
     * Output: true
     */
    public static void main(String[] args) {
        boolean powerOfTwo=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        if((num &(num-1))==0 && num>0){
            powerOfTwo=true;
        }
        System.out.println(powerOfTwo);
    }
}
