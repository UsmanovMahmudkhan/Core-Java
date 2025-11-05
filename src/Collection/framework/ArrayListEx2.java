package Collection.framework;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class ArrayListEx2 {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>(Arrays.asList("Java","C","C++","Rust","Golang"));
        System.out.println(names);
        ListIterator<String>listIterator=names.listIterator();
        while(listIterator.hasNext()){
            String name= listIterator.next();
            System.out.println(name);
            listIterator.set(name + "+");
        }
        System.out.println(names);

        System.out.print("Reversed list: ");
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }



    }
}
