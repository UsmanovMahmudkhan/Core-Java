package Basic_problems;

/**
 * Hello Lambda: Write a lambda that prints "Hello, Java!" without using System.out.println directly in the main method.
 */
class ListSort{
    public static void main(String[] args) {
        hello greet = () -> {
            System.out.println("Hello, Java!");
        };
        greet.greet();
    }
}


interface hello{
    void greet();
}