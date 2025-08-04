package CoreConcept;

public class VarDeclareUsingClass {
    public static void main(String[] args) {
        var number=new Number(6);
        System.out.println(number.getNum());
        number.setNum(2);
        System.out.println(number.getNum());
    }
}

class Number{
    private int number;
    public Number(int num){
        this.number=num;
    }

    public int getNum(){
        return number;
    }

    public void setNum(int newNum){
        number=newNum;
    }
}
