package Basic_problems;

/**
 *  Generic Maximum Finder
 *
 * Implement a generic method max that returns the maximum of three elements using Comparable.
 */
public class GenCompare {

    public static void main(String[] args) {
        max(32,23,243);

    }

    public static <T extends Comparable<T> >void max(T r,T r2,T r3){
        if(r.compareTo(r2) >0  && r.compareTo(r3)>0){
            System.out.println(r);
        } else if (r2.compareTo(r3) > 0) {
            System.out.println(r2);
        }
        else{
            System.out.println(r3);
        }

    }


}
