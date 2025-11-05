package Collection.framework;


import java.util.ArrayList;


public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String>array=new ArrayList<>();
        array.trimToSize();
        array.add("java");
        array.add("C");
        array.add("C++");
        array.add("C#");
        array.add("PHP");

        System.out.println(array);

        array.remove("java");
        array.removeFirst();
        System.out.println(array);
    }
}
