package basic_problems;

public class Working_withClass {
    /**
     Create a Rectangle class with attributes length and width.
     Add a method to calculate the area.
     **/
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(12,32);
        r1.show();
    }
}

class Rectangle{
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area(){
        return length* width;
    }

    void show(){
        System.out.println("Area: "+area());
    }


}

