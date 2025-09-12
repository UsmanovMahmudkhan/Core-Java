package CoreConcept;

import javax.xml.transform.Source;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;

/**
 * @author mahmudkhonusmonov
 * Write a program that asks for your age using BufferedReader and then prints:
 * You are X years old
 */
public class Readers {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter your age: ");

        BufferedReader read= new BufferedReader(new InputStreamReader(System.in,System.console().charset()));

        int age= Integer.parseInt(read.readLine());

        System.out.println("You are "+age+ "  years old");

    }
}
