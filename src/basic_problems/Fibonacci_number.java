package Basic_problems;

/**
 *  Fibonacci number
 *  (1) 0 1  1
 *  (2) 1 1  2
 *  (3) 1 2  3
 *  (4) 2 3  5
 *
 */
public class Fibonacci_number {
    public static void main(String[] args) {

         System.out.println("answer "+fib(4));
    }

    static int fib(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        System.out.println(n);
        return fib(n-1)+fib(n-2);
    }

}
