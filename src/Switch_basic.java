import java.util.Scanner;

public class Switch_basic {
    /**
     * Write a program that takes an integer input
     * from 1 to 7 and prints the corresponding day of the week
     * (1 = Monday, 7 = Sunday). Use a switch statement.
     */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input= sc.nextInt();
        switch (input){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong input!");

        }
    }
}
