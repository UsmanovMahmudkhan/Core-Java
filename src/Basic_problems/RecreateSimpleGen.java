package Basic_problems;

/**
 * Task: Implement a generic class Gen<T> with a constructor,
 * T getOb(), and void showType();
 * then create Gen<Integer> and Gen<String> objects
 * and show their types and values.
 */
public class RecreateSimpleGen {
    public static void main(String[] args) {
        Gen<Integer> myInt= new Gen<>(1);
        Gen<String> myStr= new Gen<>("Hallo");

        System.out.println(myInt.getMyobj());;
        System.out.println(myStr.getMyobj());;

        myStr.showType();
        myInt.showType();
    }
}

class Gen<T>{
    T myobj;

    public Gen(T myobj) {
        this.myobj = myobj;
    }

    public T getMyobj() {
        return myobj;
    }

    public void showType(){
        System.out.println(myobj.getClass().getName());
    }
}
