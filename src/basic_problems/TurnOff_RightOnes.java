package basic_problems;

import java.util.Scanner;

public class TurnOff_RightOnes {
    /**
     * Turn off the rightmost 1-bit in the binary representation of n.
     * Example:
     * Input: n = 12
     * Output: 8
     * Explanation: 1100 -> 1000
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num= sc.nextInt();
        int step=0;
        while (num>0){
            if((num & 1)==1){
                num>>=1;
                num<<=step+1;
                break;

            }
            else {
                step++;
                num>>=1;
            }
        }

        System.out.println(step+" "+num);

    }
}
