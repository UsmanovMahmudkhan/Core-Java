package Basic_problems;

public class GenIsIN {
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5,6,7,45,34,23,4,54,23,5,0,23,12,333};
        String[] strArray = {"salom","Hello","Hallo","hi","Nice"};

        System.out.println(isIn(intArray, 4));
        System.out.println(isIn(strArray, "Hello"));
    }

    public static <T> boolean isIn(T[] arr, T val) {
        for (T element : arr) {
            if (element.equals(val)) {
                return true;
            }
        }
        return false;
    }
}