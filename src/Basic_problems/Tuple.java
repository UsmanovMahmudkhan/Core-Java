package Basic_problems;
/**
 @exercise Create a generic class `Tuple<A, B>` that can store two values of different types.
 @task1 Add methods to get the first and second values.
 @task2 Override `toString()` to return "(first, second)".
 @task3 Write a static generic method `swap(Tuple<X, Y> tuple)` that returns a new `Tuple<Y, X>` with values swapped.
 @task4 Write a static generic method `combine(Tuple<X, Y> t1, Tuple<X, Y> t2)` that returns a new `Tuple<List<X>, List<Y>>`.
 @task5 In the main method, test:
 - swap(new Tuple<>(1, "apple"))  → ("apple", 1)
 - combine(new Tuple<>(1, "A"), new Tuple<>(2, "B")) → ([1, 2], [A, B])
 */
import java.util.List;

public class Tuple<A, B> {
    private final A first;
    private final B second;

    public Tuple(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }

    public static <X, Y> Tuple<Y, X> swap(Tuple<X, Y> tuple) {
        return new Tuple<>(tuple.getSecond(), tuple.getFirst());
    }

    public static <X, Y> Tuple<List<X>, List<Y>> combine(Tuple<X, Y> t1, Tuple<X, Y> t2) {
        return new Tuple<>(List.of(t1.getFirst(), t2.getFirst()), List.of(t1.getSecond(), t2.getSecond()));
    }

    public static void main(String[] args) {
        System.out.println(Tuple.swap(new Tuple<>(1, "apple")));
        System.out.println(Tuple.combine(new Tuple<>(1, "A"), new Tuple<>(2, "B")));
    }
}

