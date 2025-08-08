package Basic_problems;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

    /*
    Write a Java program to sort a numeric array and a string array.
     */
    public static void main(String[] args) {
        int nums[]= {1,2,43,12,43,2,655,8,56,34,6,34,7,8,4,34,54,6};
        Arrays.sort(nums);
        for(int n:nums){
            System.out.println(n);
        }

    }
}
