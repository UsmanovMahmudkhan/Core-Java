package basic_problems;

/**
 * Write a program to declare two Circles objects
 * with different radii and print their circumferences.
 */
public class Circle {
    public static void main(String[] args) {

        Circles c1=new Circles(12);
        Circles c2=new Circles(3);
        c1.print();
        c2.print();
    }
}

class Circles{
    double r;

    public Circles(double r) {
        this.r = r;
    }

    private double circumferences(){
        return 2*r*Math.PI;
    }

    void print(){
        System.out.println("Circumferences: ----> "+circumferences()+" <----");
    }


}