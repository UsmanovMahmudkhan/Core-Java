package Basic_problems;

/**
 * Write a Java program to create an interface Shape with the getArea() method.
 * Create three classes Rectangle, Circle, and Triangle that implement the Shape interface.
 * Implement the getArea() method for each of the three classes.
 */

public class ShapesExerciseUsing_Interfaces {
    public static void main(String[] args) {

        var rectangle=new RectangleShape(12,12);
        var triangle=new TriangleShape(3,8);
        var circle=new CircleShape(14);
        rectangle.getArea();
        triangle.getArea();
        circle.getArea();
        rectangle.getMassage();
    }
}

interface Shape{
     void getArea();

    private static String getPrivate(){
        return "This is private Massage";
    }
     default void getMassage(){
         System.out.println("Hello, this is a default method");
         System.out.println(getPrivate());
     }

}

class RectangleShape implements Shape{
    double length;
    double width;

    public RectangleShape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void getArea() {
        System.out.println("Area of rectangle: "+length*width);

    }
}

class TriangleShape implements Shape{
    double base;
    double height;

    public TriangleShape(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void getArea() {
        System.out.println("Area of Triangle: "+0.5*base*height);
    }
}

class CircleShape implements Shape{
    double radius;

    public CircleShape(double radius) {
        this.radius = radius;
    }


    @Override
    public void getArea() {
        System.out.println("Area of Circle: "+Math.PI*Math.pow(radius,2));
    }
}

