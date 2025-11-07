package Collection.framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//Reverse a LinkedList in-place.
//Either swap via Deque methods or manipulate Node pointers;
// validates understanding of iteration invariants. O(n), O(1) extra for Node-based.
public class LinkedListEx2 {
    public static void main(String[] args) {
        LinkedList<String>names=new LinkedList<>();
        names.add("John");
        names.add("Abc");
        System.out.println(names);
        System.out.println(names.reversed());


        List<String>reversed=new LinkedList<>();
        for(int i=names.size()-1;i>=0;i--){
            reversed.add(names.get(i));
        }

        System.out.println(reversed);


        for (int i = 0, j = names.size() - 1; i < j; i++, j--) {
            String temp = names.get(i);
            names.set(i, names.get(j));
            names.set(j, temp);
        }

        System.out.println(names);

    }
}
