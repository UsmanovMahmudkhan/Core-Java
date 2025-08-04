package basic_problems;

/**
 * @author mahmudkhonusmonov
 * Write a method concat(char... letters) that returns a String made from all characters.
 * concat('H', 'e', 'l', 'l', 'o');   Output: "Hello"
 */
public class ConcanateUsingVarArgs {
    public static void main(String[] args) {
        String full=concat('H', 'e', 'l', 'l', 'o','1');
        System.out.println(full);
    }
    static String concat(char...chars){
        String full="";
        for(char x: chars){
            full+=x;
        }
        return full;
    }
}
