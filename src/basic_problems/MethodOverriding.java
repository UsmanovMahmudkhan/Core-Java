package basic_problems;

/**
 * @author mahmudkhonusmonov
 * Create a class Animal with a method make Sound()
 * Extend it with classes Dog and Cat that override makeSound()
 * Create objects of each and call their method
 */
public class MethodOverriding {
    public static void main(String[] args) {
        var animal=new Animal();
        animal.makeSound();
        var dog=new Dog();
        dog.makeSound();
        var cat=new Cat();
        cat.makeSound();
    }
}

class Animal{
    void makeSound(){
        System.out.println("sound!!!!!!");
    }
}

class Dog extends Animal{
    @Override
    void makeSound() {
        System.out.println("Dog is in sound!!!");;
    }
}

class Cat extends Animal{
    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("Cat is in Sound!!!");
    }
}
