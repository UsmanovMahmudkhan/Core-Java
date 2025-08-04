package basic_problems;

/**
 * Create a class Box with:
 * 	•	A parameterized constructor: (double w, double h, double d)
 * 	•	A copy constructor: (Box b)
 * 	•	Print all values in both cases
 */
public class BothConstructors {
    public static void main(String[] args) {
        Box box1 = new Box(105, 52, 38);
        Box box2 = new Box(box1);
    }

}
class Box{
    int height;
    int width;
    int depth;

    public Box(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        System.out.println("Width: " + width + ", Height: " + height + ", Depth: " + depth);

    }

    public Box(Box box){
        height= box.height;
        width= box.width;
        depth= box.depth;
        System.out.println();
        System.out.println("Copy Constructor:");
        System.out.println("Width: " + width + ", Height: " + height + ", Depth: " + depth);
    }
}
