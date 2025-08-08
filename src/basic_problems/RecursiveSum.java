package Basic_problems;

/**
 * Write a Java recursive method to calculate the sum of all numbers from 1 to n.
 */
public class RecursiveSum {
    public static void main(String[] args) {
        System.out.println(sum(10));
    }

    static long sum(int i){
        if(i<=0){
            return 0;
        }
        else {
            return i+sum(i-1);
        }
    }
}
