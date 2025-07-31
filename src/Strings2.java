public class Strings2 {
    public static void main(String[] args) {
        String myStr="my first String";
        String myStr2="my "+"second "+" String";
        String myStr3=myStr+" <<<< this is actually third String object";
        System.out.println(myStr);

        char character=myStr.charAt(myStr.length()-1);
        System.out.println(character);
        int len=myStr.length();
        System.out.println(len);

        System.out.println(myStr2);

        System.out.println(myStr3);

        boolean check= myStr.equals(myStr3);
        System.out.println(check);








    }
}
