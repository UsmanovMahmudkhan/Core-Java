package Basic_problems;

/**
 * @author mahmudkhonusmonov
 *   Write a Java program to create
 *   a Animal interface with a method called bark()
 *   that takes no arguments and returns void.
 *   Create a Dog class that implements Animal and overrides speak() to print "Dog is barking".
 */
public class Animal_Interface {
    public static void main(String[] args) {
        var dog=new Dog_Interface();
        dog.bark();
    }
}

interface Animal_inter{
    void bark();
}

class Dog_Interface implements Animal_inter{
    @Override
    public void bark() {
        System.out.println("Dog is barking!");
    }
}
