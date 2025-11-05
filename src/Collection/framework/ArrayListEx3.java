package Collection.framework;

import java.util.ArrayList;

public class ArrayListEx3 {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        for(int i=1;i<=10;i++){
            numbers.add(i);
        }
        System.out.println(numbers);

        int sum=0;
        for(int number: numbers){
            System.out.print(number+" ");
            sum+=number;
        }

        System.out.println("Sum: "+sum);
        System.out.println("average: "+(sum/ numbers.size()));

    }

}
