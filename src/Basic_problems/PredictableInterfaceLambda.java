package Basic_problems;


/**
 * TODO:
 * Create a generic functional interface that represents a predicate (boolean test(T value)).
 * Use a lambda expression to test whether:
 * 	1.	An integer is even
 * 	2.	A string starts with the letter “A”
 */
public class PredictableInterfaceLambda {
    public static void main(String[] args) {
        Predicate<Integer>myIntegerChecker=(number)->
        {
            if(number%2!=0)  return false;
            else return true;
        };

        Predicate<String>myStringChecker=(input)->
        {
            if(input.toLowerCase().startsWith("a")) return true;
            else return false;
        };

        System.out.println(myIntegerChecker.test(12));
        System.out.println(myIntegerChecker.test(Integer.parseInt("13")));

        System.out.println(myStringChecker.test("salom"));
        System.out.println(myStringChecker.test("Amazing"));
    }
}

interface Predicate<T>{
    boolean test(T value);
}
