package Basic_problems;

public class AverageArray {
    /**
     * Write a Java program to calculate the average value of array elements.
     */

    public static void main(String[] args) {
        int sum=0;
        double avg;
        int nums[]=new int[10];
        for(int n:nums){
            nums[n]=(int)(Math.random()*10);
            sum+=nums[n];
            System.out.print(nums[n]+"\t\t");
        }
        System.out.println(" ="+sum);
        System.out.println("Average: "+(double)sum/2);
    }
}
