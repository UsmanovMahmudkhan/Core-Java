package Basic_problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author mahmudkhonusmonov
 * Read one line and print its length.
 */
public class LengthStringInStream {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String  input = reader.readLine();
        int size=input.length();
        System.out.println("Actual input: "+input+" "+"Size: "+size);
    }
}
