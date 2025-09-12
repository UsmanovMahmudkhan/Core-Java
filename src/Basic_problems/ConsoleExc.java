package Basic_problems;

import java.io.Console;

/**
 * @author mahmudkhonusmonov
 * Use Console to ask the user’s name and print:
 * Hello, <name>!
 */
public class ConsoleExc {
    public static void main(String[] args) {
        Console c= System.console();
        String question=" Enter you age: ";
        System.out.println(question);
        int age=Integer.parseInt(c.readLine());
        System.out.println("You are "+age+" yeard old");


    }
}
