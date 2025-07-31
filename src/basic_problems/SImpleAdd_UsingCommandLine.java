package basic_problems;

public class SImpleAdd_UsingCommandLine {
    public static void main(String[] args) {
        if(args.length<3){
            System.out.println("Yiban!! you are supposed to enter <operation> <num1> <nums2>");
            return;
        }
        String add="+";
        if(args[0].equals(add)){
            int a=Integer.parseInt(args[1]);
            int b=Integer.parseInt(args[2]);
            System.out.println(a+b);
        }
    }

    /**
     * % javac basic_problems/SImpleAdd_UsingCommandLine.java
     *  % java basic_problems.SImpleAdd_UsingCommandLine + 18 10
     *  28
     */
}
