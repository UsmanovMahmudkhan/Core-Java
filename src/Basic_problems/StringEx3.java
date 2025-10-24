package Basic_problems;
//Create a string from a character array and from a byte array.
public class StringEx3 {
    public static void main(String[] args) {
        char[] myChar={'s','a','l','o','m'};
        String str= new String(myChar);
        System.out.println(str);

        byte[] byteArr={21,32,54,87,87,112};
        String str2= new String(byteArr);
        System.out.println(str2);
    }
}
