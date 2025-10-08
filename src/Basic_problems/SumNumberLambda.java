package Basic_problems;

/**
 * Sum Two Numbers: Write a lambda (a, b) -> a + b and apply it to two integers.
 */
public class SumNumberLambda {
    public static void main(String[] args) {
        SumLambda sum=(numbers)->{
            int result=0;
            for(int i=0;i< numbers.length;i++){
                result+=numbers[i];
            }
            return result;
        };

        System.out.println(sum.sum(1,2,3,4,5,6,7,8,8,9,56,34,23,54,56));
    }
}

interface SumLambda{
    int sum(int ... number);
}
