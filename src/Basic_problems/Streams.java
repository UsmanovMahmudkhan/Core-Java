package Basic_problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author mahmudkhonusmonov
 * Write a program that reads a full line of text from the keyboard and prints it back.
 * Test with spaces, digits, and special characters.
 */
public class Streams {
    public static void main(String[] args) throws IOException {
        BufferedReader full = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a text: ");
        String input= full.readLine();
        System.out.println("Input: "+input);

    }
}
