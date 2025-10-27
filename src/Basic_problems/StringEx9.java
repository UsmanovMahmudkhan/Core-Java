package Basic_problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Extract the characters from index 2 to 6 of a string using getChars().
 */
public class StringEx9 {
    public static void main(String[] args) throws IOException {
        BufferedReader read= new BufferedReader(new InputStreamReader(System.in));
        String input=read.readLine();
        char data[]=new char[4];
        input.getChars(2,6,data,0);
        System.out.println(data);

    }
}
