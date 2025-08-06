package basic_problems;

/**
 * @author mahmudkhonusmonov
 *  Write a Java program to create an interface Resizable
 *  with methods resizeWidth(int width) and resizeHeight(int height)
 *  that allow an object to be resized. Create a class Rectangle that
 *  implements the Resizable interface and implements the resize methods
 */
public class ResizableInt {
    public static void main(String[] args) {
        Rectangles rec=new Rectangles(12,32);
        System.out.println(rec.toString());
        rec.resizeHeight(99);
        rec.resizeWidth(100);
        System.out.println(rec.toString());

    }
}

interface Resizable{
    int resizeWidth(int width);
    int resizeHeight(int height);
}

class Rectangles implements Resizable{
    private int width;
    private int height;

    public Rectangles(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int resizeWidth(int width) {
        this.width=width;
        return width;
    }

    @Override
    public int resizeHeight(int height) {
        this.height=height;
        return height;
    }

    @Override
    public String toString() {
        return "Rectangles{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
