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
public class Tuple {
    public static void main(String[] args) {

    }
}



