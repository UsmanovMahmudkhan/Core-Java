public class AccessModifiers {
    public static void main(String[] args) {
       Access a=new Access();
       a.a=10;
       a.b=13;
       a.setC(12);
       a.d=20;
       System.out.println("private C: "+ a.getC()+ " B: "+a.b+" A: "+a.a);
        System.out.println(a.d);
    }
}
class Access{
    int a;
    public int b;
    private int c;
    protected int d;

    void setC(int num){
        c=num;
    }
    int getC(){
        return c;
    }
}