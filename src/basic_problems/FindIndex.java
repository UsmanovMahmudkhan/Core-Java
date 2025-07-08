package basic_problems;

import java.util.Scanner;

public class FindIndex {
    /**
     * Write a Java program to find the index of an array element.
     */
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a taget number: ");
        int target= sc.nextInt();
        int[]nums={12,32,4,12,512,4,1,2,3,4,65,8,6};
        for(int n=0;n< nums.length;n++){
            if(target==nums[n]){
                System.out.println("Target: ["+target+"] and index:["+n+"]");
                count++;
            };

        }
        System.out.println("Total appereance: "+count);
    }
}
