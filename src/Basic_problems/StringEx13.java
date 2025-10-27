package Basic_problems;

/**
 * Use regionMatches() to check whether the substring "com" in "computer" matches "Com" from "Company" (case-insensitive).
 */
public class StringEx13 {
    public static void main(String[] args) {
        String input1="computer";
        String input2="cOmpnay";
        System.out.println(input1.regionMatches(true,0,input2,0,3));
    }
}
