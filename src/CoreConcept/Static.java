package CoreConcept;

public class Static {
    static int a=12;
    static int b;

    static void callme(int some){
        b=some;
        System.out.println(b);
    }
    public static void main(String[] args) {
        System.out.println(a);
        callme(19);

    }
}
