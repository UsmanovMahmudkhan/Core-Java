package Basic_problems;

import java.util.Scanner;

public class CountBitsOnes {
    /**
     * Count the number of 1s in the binary representation of n.
     * Example:
     * Input: n = 13
     * Output: 3
     * Explanation: 13 -> 1101 (3 set bits)
     */

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=s.nextInt();
        int count=0;
        while(num>0){
            if((num & 1) ==1){
                count++;
                num=num>>1;
            }else{
                num>>=1;
            }
        }
        System.out.println(count);

    }
}
