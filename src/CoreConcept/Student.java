package CoreConcept;

/**
 * Pass CoreConcept.Student object to a method to print its details.
 */
public class Student {
    public static void main(String[] args) {
        Students s1=new Students("khan",20);
        Students.show(s1);

    }
}
class Students{
    String name;
    int age;

    public Students() {
    }

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    static void show(Students s){
        System.out.println("Name:  "+s.name+" age:  "+s.age);
    }

}
