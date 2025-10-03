package Basic_problems;

/**
 * Generic Swap Method
 * Write a generic method swap that swaps the positions of two elements in an array of any type.
 */
public class GenSwapArray {
    public static void main(String[] args) {
        Integer [] myArr= new Integer[3];
        for(int i=0;i<3;i++){
            myArr[i]=i+1;
            System.out.print(myArr[i]+" ");
        }

        System.out.println();
        swap(myArr);

        for(int i=0;i<3;i++){
            System.out.print(myArr[i]+" ");
        }
    }

    public static <T> void swap(T[] array){
       T temp=array[1];
       array[1]=array[2];
       array[2]=temp;
    }
}


