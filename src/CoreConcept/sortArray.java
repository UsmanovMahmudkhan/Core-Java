package CoreConcept;

import java.util.Scanner;

public class sortArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size= sc.nextInt();
        int[]myArr=new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter "+(i+1)+"th number: ");
            int data= sc.nextInt();
            myArr[i]=data;
        }

        //showing full array
        for(int i=0;i< myArr.length;i++){
            System.out.println(myArr[i]);
        }

        //sorting one dimentional array,using temp variable
        for (int i = 0; i < myArr.length - 1; i++) {
            for (int j = 0; j < myArr.length - i - 1; j++) {
                if (myArr[j] > myArr[j + 1]) {
                    int temp = myArr[j];
                    myArr[j] = myArr[j + 1];
                    myArr[j + 1] = temp;
                }
            }
        }

        //showing sorted array in asceding order
        for(int i=0;i< myArr.length;i++){
            System.out.println(myArr[i]);
        }


    }
}
