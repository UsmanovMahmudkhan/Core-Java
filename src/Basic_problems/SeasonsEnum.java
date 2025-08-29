package Basic_problems;

/**
 * Create an enum `Seasons` with SPRING, SUMMER, FALL, and WINTER.
 * Implement a method to return a string describing typical weather for each season.
 * Encourages the use of enum-specific methods to provide descriptive output,
 * leveraging the class-like nature of enums.
 */
public class SeasonsEnum {
    public static void main(String[] args) {
       Season s1= Season.valueOf("SPRING");
       System.out.println(s1);
       System.out.println(s1.ordinal());
       s1=Season.FALL;
       System.out.println(s1.ordinal());
    }
}

enum Season{
    SPRING("THIS IS WHEN I WAS BORN"), SUMMER("THIS IS WHAT I REALLTY LIKE WHEN EVERYTHING FEELS JUST GOOD") ,
    FALL("THIS IS WHERE RAIN STARTS"), WINTER("I LIKE SNOW, BUT NOT COLD");
    private final String description;
    Season(String name) {
        this.description = name;
    }

    public String getInfo()

    {

        return description;
    }

    }

