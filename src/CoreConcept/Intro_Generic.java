package CoreConcept;

/**
 *  .	Create a generic class Box<T> that can hold an object of any type.
 * 	•	Add methods: void set(T item) and T get().
 * 	•	Test it with Integer, String, and a custom class.
 */
public class Intro_Generic {
    public static void main(String[] args) {
        Box<Integer>mybox1= new Box<>();
        mybox1.setObj(12);
        System.out.println("Class: "+mybox1.showType());
        System.out.println("Value:"+mybox1.getObj());

        Box<String>myStr= new Box<>();
        myStr.setObj("Hello Generics");
        System.out.println("Class: "+myStr.showType());
        System.out.println("Value: "+myStr.getObj());

        Box<MyCustomClass>myCustomClassBox= new Box<>();
        myCustomClassBox.setObj(new MyCustomClass("salom",22));
        System.out.println("Class: "+myCustomClassBox.showType());
        System.out.println("Value: "+myCustomClassBox.getObj().getName()+" , "+myCustomClassBox.getObj().getAge());
    }
}

class Box<T>{
    T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public T showType(){
        return (T) obj.getClass().getName();
    }
}



class MyCustomClass{
    String name;
    int age;

    public MyCustomClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
