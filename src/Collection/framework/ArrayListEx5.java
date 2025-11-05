package Collection.framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListEx5 {
    public static void main(String[] args) {
        Student st1=new Student("ali",4);
        Student st2=new Student("vali",2);
        Student st3=new Student("abc",3);
        ArrayList<Student>allStudent=new ArrayList<>();
        allStudent.add(st1);
        allStudent.add(st2);
        allStudent.add(st3);

        System.out.println(allStudent);

        Collections.sort(allStudent, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getGrade(), o2.getGrade());
            }
        });

        System.out.println(allStudent);

    }

}

class Student{
    String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
