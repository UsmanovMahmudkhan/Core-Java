package basic_problems;

/**
 * @author mahmudkhonusmonov
 * Write a Java program to create a vehicle class hierarchy.
 * The base class should be Vehicle, with subclasses Truck, Car and Motorcycle.
 * Each subclass should have properties such as make, model, year, and fuel type.
 * Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.
 */
public class CarsInheritance {
    public static void main(String[] args) {

        var truck=new Truck("Honda","X",2012,"Gas",123.12F,12,250);
        var car=new CARR("Tesla","Y",2023,"Electr",0,0,280);
        var motor=new Motorcycle("Honda","Z",2024,"Gazoline",250.12F,30,350);
//        truck.print();
//        car.print();
//        motor.print();

//        System.out.println(truck.effect());
//        System.out.println(car.effect());
//        System.out.println(motor.effect());

        System.out.println(truck.distance());
        System.out.println(car.distance());
        System.out.println(motor.distance());
    }
}

class Vehicles {

    String make;
    String model;
    int year;
    String fuelType;
    float usedFuels;
    float effectFuel;
    int maxSpeed;


    public Vehicles(String make, String model, int year, String fuelType, float usedFuels, float effectFuel,int maxSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.usedFuels = usedFuels;
        this.effectFuel = effectFuel;
        this.maxSpeed=maxSpeed;
    }

    public float effect(){
        return 0;
    }

    public float distance(){
        return 0;
    }

    void print(){
        System.out.println("Make: "+make);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
        System.out.println("Fuel: "+fuelType);
        System.out.println("Used: "+usedFuels);
        System.out.println("Effect: "+effectFuel);
        System.out.println("Speed: "+maxSpeed);
    }
}

class Truck extends Vehicles{

    public Truck(String make, String model, int year, String fuelType, float usedFuels, float effectFuel,int maxSpeed) {
        super(make, model, year, fuelType, usedFuels, effectFuel,maxSpeed);
    }

    @Override
    public float distance() {
        return usedFuels*effectFuel;
    }

    @Override
    public float effect() {
        return distance()/usedFuels;
    }


    @Override
    void print() {
        super.print();
    }
}

class CARR extends Vehicles{
    public CARR(String make, String model, int year, String fuelType, float usedFuels, float effectFuel, int maxSpeed) {
        super(make, model, year, fuelType, usedFuels, effectFuel, maxSpeed);
    }
    @Override
    public float distance() {
        return usedFuels*effectFuel;
    }

    @Override
    public float effect() {
        return distance()/usedFuels;
    }

    @Override
    void print() {
        super.print();
    }
}

class Motorcycle extends Vehicles{
    public Motorcycle(String make, String model, int year, String fuelType, float usedFuels, float effectFuel, int maxSpeed) {
        super(make, model, year, fuelType, usedFuels, effectFuel, maxSpeed);
    }

    @Override
    public float distance() {
        return usedFuels*effectFuel;
    }

    @Override
    public float effect() {
        return distance()/usedFuels;
    }
    @Override
    void print() {
        super.print();
    }
}



