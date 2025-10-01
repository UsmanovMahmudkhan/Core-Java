/**
@creator Usmonov Mahmudkhon
@exercise Create a generic class `Pair<K, V>` that can store a key of type K and a value of type V.
@task1 Add a constructor to initialize both key and value.
@task2 Write methods to return the key and value separately.
@task3 Write a method to display the key-value pair in the format "key=value".
@task4 In the main method, create objects of Pair with different combinations (Integer, String), (String, Double), etc.
@task5 Print the results and check if it works with different type combinations.
*/
package Basic_problems;

public class GenEx2 {
    public static void main(String[] args) {
        Pair<String, Integer>pair1= new Pair<>("khan",1);
        Pair<Double,String> pair2= new Pair<>(3.4,"PI value");
        System.out.println(pair1.getKey());
        System.out.println(pair2.getKey());
        System.out.println(pair1.display());
        System.out.println(pair2.display());
    }
}

class Pair<K,V>{
    K key;
    V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public  String display(){
        return key+"="+value;
    }
}
