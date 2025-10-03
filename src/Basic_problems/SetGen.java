package Basic_problems;
/**
 @exercise Create a generic class `Box<T>` that stores a single value. -
 @task1 Add methods to put and get the value. -
 @task2 Override `toString()` to display the stored value. -
 @task3 Write a static generic method `swap(Box<T> b1, Box<T> b2)` that swaps their contents.
 @task4 Write a static generic method `merge(Box<X> b1, Box<Y> b2)` that returns a `Tuple<X, Y>`.
 @task5 In the main method, test:
 - swap(Box.of(10), Box.of(20)) → Boxes contain 20 and 10
 - merge(Box.of("pi"), Box.of(3.14)) → ("pi", 3.14)
 */

public class SetGen {
    public static void main(String[] args) {

        BoxS<Integer>b1= new BoxS<>(12);
        BoxS<Integer>b2= new BoxS<>(23);
        System.out.println(b1.getObj()+" "+b2.getObj());
        swap(b1,b2);
        System.out.println(b1.getObj()+" "+b2.getObj());
    }

    public static <T> void swap(BoxS<T> t1, BoxS<T> t2){
        T  temp= t1.getObj();
        t1.setObj(t2.getObj());
        t2.setObj(temp);
    }
}

class BoxS<T>{
    T obj;

    public BoxS(T obj) {
        this.obj = obj;
    }


    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "BoxS{" +
                "obj=" + obj +
                '}';
    }

  /**  @task3 Write a static generic method `swap(Box<T> b1, Box<T> b2)` that swaps their contents.*/


}



