package Collection.framework;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx1 {
    public static void main(String[] args) {
        LinkedList<String>names=new LinkedList<>();
        names.add("hello");
        names.add("abc");
        names.add("abc");
        names.add("hello");
        System.out.println(names);
        Collections.sort(names);

        Iterator<String>iterator= names.iterator();
        HashSet<String>sorted=new HashSet<>();
        while(iterator.hasNext()){
            String found=iterator.next();
            if(!sorted.add(found)){
                iterator.remove();
            }
        }

        System.out.println(names);
    }
}
