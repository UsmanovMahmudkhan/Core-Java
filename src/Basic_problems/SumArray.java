package Basic_problems;

public class SumArray {

    /**
     * Write a Java program to sum values of an array.
     */
    public static void main(String[] args) {
        int sum=0;
        int nums[] =new int[10];
        for(int n:nums){
            nums[n]= (int) (Math.random()*10);
            sum+=nums[n];
            System.out.print(nums[n]+"\t\t");
        }
        System.out.println("="+sum);

    }
}
