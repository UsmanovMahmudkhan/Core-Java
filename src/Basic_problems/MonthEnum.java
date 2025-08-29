package Basic_problems;

/**
 * Write an enum `Months` with the 12 months (JANUARY, FEBRUARY, ..., DECEMBER).
 * Use the `valueOf()` method to retrieve a specific month by its name (e.g., "JULY").
 *Focuses on using `valueOf()` to dynamically access enum constants by string input,
 * handling case sensitivity and invalid inputs.
 */
public class MonthEnum {
    public static void main(String[] args) {
        Months month= Months.APRIL;
        System.out.println(month);
        System.out.println(Months.valueOf("MAY"));
        System.out.println(Months.valueOf("JUNE"));
    }

}

enum Months{
        JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER;
}


