package Basic_problems;

/**
 * Write a program to check if a string starts with "Java" and ends with "Code" using startsWith() and endsWith()
 */
public class StringEx15 {
    public static void main(String[] args) {
        String input="Java code";
        String input2="coder writse code";
        System.out.println(input.startsWith("Java"));
        System.out.println(input2.endsWith("code"));
    }
}
