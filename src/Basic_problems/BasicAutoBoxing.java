package Basic_problems;

/**
 *
 * Create an Integer object by assigning an int directly. Print both the primitive and the object.
 */
public class BasicAutoBoxing {
    public static void main(String[] args) {
        Integer number;
        int primitive_num=23;
        number=primitive_num;
        System.out.println(number);
        System.out.println(primitive_num);
        Float num= (float) (primitive_num*0.1);
        System.out.println(num);
    }
}
