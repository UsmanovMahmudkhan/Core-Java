package basic_problems;

/**
 * Create a CoreConcept.Student class and
 * demonstrate assigning one student object reference to another,
 * then modify one and observe the effect.
 */
public class Student {
    public static void main(String[] args) {
        Students s1=new Students("khan",20,"Cs");
        Students s2=new Students("AA",0,"HHH");
        s1.age=s2.age;
        System.out.println(s1.age+"  "+s2.age);
        s2=s1;
        System.out.println(s2.name);
        s2.name="www";
        System.out.println(s2.name+" "+s1.name);


    }
}
class Students{
    String name;
    int age;
    String major;

    public Students(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }
}

