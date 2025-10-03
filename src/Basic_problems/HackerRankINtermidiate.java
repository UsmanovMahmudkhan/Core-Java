package Basic_problems;

import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;


class ResultHacker {

    public static long countPairs(List<Integer> arr) {
        int ispower=0;
        int nums=0;
        for( int i=0; i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                ispower=arr.get(i)&arr.get(j);
                if(poweroftwos(ispower)){
                    nums++;
                }
            }
        }

        return nums;

    }

    public static boolean poweroftwos(int number) {
        if (number <= 0) return false;
        while (number % 2 == 0) {
            number /= 2;
        }
        return number == 1;
    }

}
public class HackerRankINtermidiate {
    public static void main(String[] args) throws IOException {
         Long  num= ResultHacker.countPairs(List.of(1,2,3,4,5,6,7,8));
        System.out.println(num);



    }
}
