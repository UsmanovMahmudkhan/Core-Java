class BooleanExample {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);
        if(b) System.out.println("This is executed.");
        b = false;
        if(b) System.out.println("This is not executed.");
        System.out.println("10 > 9 is " + (10 > 9));
        int x= 123_342_232;
        System.out.println(x);
    }
}