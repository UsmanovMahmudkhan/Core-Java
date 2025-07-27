package basic_problems;

/**
 *  Fibonacci number
 *  0 1 1
 *    1 1 2
 *      1 2 3
 *        2 3 5
 *
 */
public class Fibonacci_number {
    public static void main(String[] args) {

        System.out.println(fib(4));
    }

    static int fib(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fib(n-1)+fib(n-2);
    }

}
