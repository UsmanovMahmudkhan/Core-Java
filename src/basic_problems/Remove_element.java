package Basic_problems;

import java.util.Scanner;

public class Remove_element {
    /**
     * Write a Java program to remove a specific element from an array.
     */
    public static void main(String[] args) {
        int count=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter target num to remove: ");
        int target=scanner.nextInt();
        int nums[]={1,2,3,4,5,6,6,7,8,9,0,10};
        for(int i=0;i< nums.length;i++){
            if(target==nums[i]){
                count++;
            }
        }
        int[] newArr=new int[nums.length-count];
        int j=0;
        for(int i=0;i< nums.length;i++){
            if(target!=nums[i]){
                newArr[j]=nums[i];
                j++;
            }

        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }


    }
}
