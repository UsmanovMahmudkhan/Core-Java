package Collection.framework;

import java.awt.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/** Merge two sorted LinkedLists into one sorted list.
 */
public class LinkendListEx3 {
    public static void main(String[] args) {
        LinkedList<Integer>num1 = new LinkedList<>(List.of(1,2,3,4,5,6));
        LinkedList<Integer>num2 = new LinkedList<>(List.of(3,2,4,4,5,9));
        LinkedList<Integer>sorted=new LinkedList<>();
        Collections.sort(num1);
        Collections.sort(num2);


        int i = 0, j = 0;
        while (i < num1.size() && j < num2.size()) {
            if (num1.get(i) <= num2.get(j)) {
                sorted.add(num1.get(i));
                i++;
            } else {
                sorted.add(num2.get(j));
                j++;
            }
        }

        while (i < num1.size()) {
            sorted.add(num1.get(i++));
        }
        while (j < num2.size()) {
            sorted.add(num2.get(j++));
        }

        System.out.println(sorted);


    }
}
