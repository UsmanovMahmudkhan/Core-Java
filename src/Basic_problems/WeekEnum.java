package Basic_problems;

/**
 * **Requirement:**
 * Create a basic enum called `Days` with the seven days of the week (MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY).
 * Use the `values()` method to print all days.
 * This exercise introduces the basic creation of an enum and the use of the `values()` method to access all enum constants.
 */
public class WeekEnum {
    public static void main(String[] args) {
        System.out.println("Week days: ");
        Days days[]=Days.values();
        for( Days d: days){
            System.out.print(d+" ");
        }


        }
    }


enum Days{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY, FRIDAY, SATURDAY, SUNDAY;

}
