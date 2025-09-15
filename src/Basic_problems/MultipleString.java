package Basic_problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author mahmudkhonusmonov
 * Prompt the user to enter three different sentences, each on a new line.
 * Print all three lines together separated by commas.
 */
public class MultipleString {
    public static void main(String[] args) throws Exception{
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        String one = reader.readLine();
        String two = reader.readLine();
        String three= reader.readLine();
        System.out.println(one+","+two+","+three);

    }
}
