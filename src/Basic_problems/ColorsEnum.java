package Basic_problems;

/**
 * Define an enum `Colors` with RED, GREEN, and BLUE.
 * Add a method to return a hexadecimal code (e.g., "#FF0000" for RED) for each color.
 * Introduces adding custom methods to an enum,
 * treating it as a class type to extend functionality.
 */
public class ColorsEnum {
    public static void main(String[] args) {

        System.out.println(Colors.RED.getColorName());
    }
}

enum Colors{


    RED("#FF00RED"),GREEN("FF00Gren"),BLUE("FF00BLUE");

    private final String colorName;


    Colors(String colorName) {
        this.colorName = colorName;
    }

    public String getColorName() {
        return colorName;
    }


}
