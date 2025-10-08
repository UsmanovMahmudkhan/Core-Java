package Basic_problems;

/**
 * String Length: Create a lambda that takes a string and returns its length.
 */
public class StringLength {
    public static void main(String[] args) {
        StringLen length= String::length;
        System.out.println(length.len("salom"));
    }


}

interface StringLen{
    int len(String input);
}