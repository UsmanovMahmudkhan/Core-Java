package basic_problems;

/**
 * @author mahmudkhonusmonov
 * Define a superclass Person with fields name and age.
 * Create a subclass Student with an additional field studentId.
 * Instantiate a Student object and print all its information.
 */
public class BasicInheritance {
    public static void main(String[] args) {
        var person=new Person("alan",20);
        var student=new MyStudent(person,18);
    }
}

class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person person){
        this.name= person.name;
        this.age= person.age;
        System.out.println(name+" "+age);
    }
}

class MyStudent extends Person{
    int id;
    public MyStudent(Person person,int id){
        super(person);
        this.id=id;
        System.out.println(name+" "+age+" "+id);
    }
}
