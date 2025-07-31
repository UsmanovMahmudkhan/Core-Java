package CoreConcept;

public class AStack {
    public static void main(String[] args) {

        Stack stc=new Stack();
        for(int i=0; i<10;i++){
            stc.push(i*2);
        }
        for(int i=0; i<10;i++) {
            System.out.println(stc.pup());
        }

    }
}

class Stack{
    int stack[]=new int[10];
    int item;

    public Stack(){
        item=-1;
    }

     void push(int input){
        if(item==9){
            System.out.println("It is overflowed");
        }
        else{
            stack[++item]=input;
        }
    }

    int pup(){
        if(item<0){
            System.out.println("underflow");
            return 0;
        }
        else {
            return stack[item--];
        }
    }



}
