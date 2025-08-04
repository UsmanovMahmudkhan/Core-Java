package basic_problems;

/**
 * @author mahmudkhonusmonov
 * create a class Vehicle with a constructor that takes a brand.
 * Create a subclass Car that takes both brand and model.
 * Use super() to initialize brand.
 * Print full info from a Car object.
 */
public class Cars {
    public static void main(String[] args) {
        var veh=new Vehicle("Tesla");
        var car=new Car(veh,"X");
        car.print();
    }

}

class Vehicle{
    String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public Vehicle(Vehicle vehicle) {
        this.brand= vehicle.brand;
    }
}
class Car extends Vehicle {
    String model;

    public Car(Vehicle vehicle, String model) {
        super(vehicle);
        this.model=model;

    }

    void print(){
        System.out.println(model+" "+brand);
    }
}

