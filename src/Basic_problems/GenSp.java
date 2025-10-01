package Basic_problems;

/**
@creator Usmonov Mahmudkhon
@exercise Create a generic class `GenSp<T>` that can store an object of type T.
@task1 Add a constructor to initialize the object.
@task2 Write a method to return the stored object.
@task3 Write a method to display the type of the object stored.
@task4 In the main method, create objects of GenSp with different data types (Integer, String, Double).
@task5 Print the results and verify generic behavior.
*/
public class GenSp {
    public static void main(String[] args) {
        GenSp2<Integer>int1= new GenSp2<>(3);
        GenSp2<Double>double2= new GenSp2<>(2.3);
        GenSp2<String>name=new GenSp2<>("khan");

        System.out.println(int1.getT()+" "+int1.getType());
        System.out.println(double2.getT()+" "+double2.getType());
        System.out.println((name.getT()+" "+name.getType()));
    }
}

class GenSp2<T>{
    T t;
    public GenSp2(T obj) {
        t=obj;
    }

    public T getT() {
        return t;
    }

    public String getType(){
        return t.getClass().getName();

    }
}
