package CoreConcept;

import java.lang.Number;

public class TwoGenAvg {
    public static void main(String[] args) {
        Avg<Integer>myArr= new Avg<>(new Integer[]{1,2,3,4,5,6,7,8,9,5,45,34,54,34});
        myArr.avg();

        Avg<Double> myD= new Avg<>(new Double[]{1.1,21.2});

        myArr.isSame(myD);
    }
}

class Avg<T extends Number>  {
    T[] obj;

    public Avg(T[] obj) {
        this.obj = obj;
    }

    public T[] getObj() {
        return obj;
    }

    public double avg(){
        double result=0;
        for(int i=0;i<obj.length;i++){
            result += obj[i].doubleValue();
        }

       // System.out.println("Average: "+result);
        return result/ obj.length;
    }

    public void isSame(Avg <?>anotherObjAvg){
        if(avg()==anotherObjAvg.avg()){
            System.out.println("They are eqaul");
        }
        else{
            System.out.println("They are not equal");
        }
    }


}