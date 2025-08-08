package Basic_problems;

/**
 * @author mahmudkhonusmonov
 * Write a method longest(String... words) that returns the longest string passed.
 * longest("cat", "elephant", "tiger");  Output: "elephant"
 */
public class FindLongestString {
    public static void main(String[] args) {
        System.out.println(longest("cat", "elephant", "tiger","Hahahaha11"));

    }
    static String longest(String ...inputs){
        int length=0;
        String longString = "";
        for(String x: inputs){
            if(x.length()>length) {
                length = x.length();
                longString = x;
            }

        }
        return longString;
    }
}
