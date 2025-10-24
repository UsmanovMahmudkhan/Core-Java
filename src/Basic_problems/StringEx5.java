package Basic_problems;

//Concatenate two strings without using + or concat().
public class StringEx5 {
    public static void main(String[] args) {
        String hi="hi";
        String world="world";

        StringBuilder builder= new StringBuilder();
        builder.append(hi);
        builder.append(world);
        System.out.println(builder);
    }
}
