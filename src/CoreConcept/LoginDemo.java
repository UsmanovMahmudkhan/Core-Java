package CoreConcept;

import java.io.Console;

public class LoginDemo {
    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            System.out.println("No console available.");
            return;
        }

        String username = console.readLine("Enter username: ");
        char[] password = console.readPassword("Enter password: ");

        if (username.equals("admin") && String.valueOf(password).equals("1234")) {
            console.printf("Login successful!\n");
        } else {
            console.printf("Login failed!\n");
        }
    }
}
