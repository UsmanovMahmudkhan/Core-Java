package Basic_problems;
//Reverse a string without using built-in reverse functions.
public class StringEx4 {
    public static void main(String[] args) {
        String data="salom";
        for(int i=0;i<data.length();i++){
            System.out.print(data.charAt(data.length()-1-i));
        }
    }
}
