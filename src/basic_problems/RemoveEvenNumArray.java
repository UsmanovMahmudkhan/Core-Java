package basic_problems;

import java.util.Scanner;

public class RemoveEvenNumArray {
    /**
     * Remove all even numbers from an array
     * and return a new array with only odd numbers.
     * int[] nums = {12, 7, 9, 20, 33, 42, 5};
     * output:
     * 7
     * 9
     * 33
     * 5
     */

    public static void main(String[] args) {
        int [] nums={2, 7, 9, 20, 33, 42, 5};
        int count=0;
        for(int i=0;i< nums.length;i++){
            if(nums[i]%2==0){
                count++;
            }
        }
        int [] oddArr=new int[nums.length-count];
        int j=0;
        for(int i=0;i< nums.length;i++){
            if(nums[i]%2!=0){
                oddArr[j]=nums[i];
                j++;
            }
        }

        for(int i=0;i<oddArr.length;i++){
            System.out.println(oddArr[i]);
        }
    }
}
