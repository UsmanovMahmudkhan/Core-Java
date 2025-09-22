package Basic_problems;

public class Generics {

    public static void main(String[] args) {
        Number<Integer> my1= new Number<>(12);
        Number<Double> my2= new Number<>(1.23);

        System.out.println(my1.getNum());
    }
}

class Number<T>{
    T num;

    public Number(T num) {
        this.num = num;
    }

    public T getNum() {
        return num;
    }

}
