package Basic_problems;

/**
 * @author mahmudkhonusmonov
 *  Write a method sum(int... nums) that returns the sum of all integers passed
 * sum(1, 2, 3);         // Output: 6
 * sum(5, 10, 15, 20);   // Output: 50
 */
public class SumOfIntegersUsingVar {
    public static void main(String[] args) {
        int sum=sum(1,2,3,4,5,65,22,11,22,3,3);
        int sum2=sum(1,2,3);
        System.out.println(sum);
        System.out.println(sum2);
    }
    static int sum(int ...nums){
        int sum=0;
        for(int x:nums){
           sum+=x;
        }
        return sum;
    }
}
