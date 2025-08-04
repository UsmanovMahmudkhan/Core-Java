package basic_problems;

/**
 * Create an abstract class Employee with an abstract method calculateSalary().
 * Create subclasses FullTimeEmployee and PartTimeEmployee that implement calculateSalary() differently.
 * Create an array of Employee references holding objects of both subclasses and print their salaries polymorphically.
 */
public class AdvancedInheritance {
    public static void main(String[] args) {
        var fullTime=new FullTimeEmployee();
        var partTime=new PartTimeEmployee();
        fullTime.calculateSalary();
        partTime.calculateSalary();

        Employee[] employees=new Employee[2];
        employees[0]=new FullTimeEmployee();
        employees[1]=new PartTimeEmployee();
        for(Employee e: employees){
            e.calculateSalary();
        }


    }
}

abstract class Employee{
    abstract void calculateSalary();
}
class FullTimeEmployee extends Employee{
    @Override
    void calculateSalary() {
        System.out.println("this is for full time employee");;
    }
}

class PartTimeEmployee extends Employee{
    @Override
    void calculateSalary() {
        System.out.println("this is for part time employee");
    }
}


