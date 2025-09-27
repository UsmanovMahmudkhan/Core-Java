package CoreConcept;

public class ArrayGen {
    public static void main(String[] args) {
        GenA<Integer> myArr= new GenA<>(new Integer[]{1, 2, 3, 4, 5});
        for(int i=0;i<myArr.getObj().length;i++){
            System.out.print(i+" ");
        }

        myArr.showType();

    }
}

class GenA<T>{
    T [] obj;

    public GenA(T [] obj){
        this.obj=obj;
    }

    public T[] getObj() {
        return obj;
    }

    public void showType(){
        System.out.println(
                "Type:"+obj.getClass().getName()
        );
    }

}
