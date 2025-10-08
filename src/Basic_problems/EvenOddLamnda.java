package Basic_problems;

/**
 * Even or Odd: Use a lambda to test whether an integer is even or odd.
 */
public class EvenOddLamnda {
    public static void main(String[] args) {
        Checker check=(number)->
        {
            if(number%2==0){
                return "Even";
            }
            else {
                return "Odd";
            }
        };

        System.out.println(check.check(13));
    }
}
interface Checker{
    String check(int x);
}
