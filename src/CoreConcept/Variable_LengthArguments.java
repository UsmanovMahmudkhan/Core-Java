package CoreConcept;

public class Variable_LengthArguments {


    static void varArgForInt(int ...vars){
        System.out.print("Length: "+vars.length+" Contents: ");
        for(int x: vars){
            System.out.print(x+" ");

        }
    }


    static void vrArgsForString(String ...var){
        System.out.print("Length: "+var.length+" Contents: ");
        for(String x: var){
            System.out.print(x+" ");

        }
    }

    static void mixVarArgs(String name,int age,String ...bio){
        System.out.println("Name: "+name);
        System.out.println("Age "+age);
        System.out.print("Length: "+bio.length+" Contents: ");
        for(String x:bio){
            System.out.print(x+" ");
        }
    }


    public static void main(String[] args) {
        varArgForInt(1,2,3,4,5,5,6,6);
        System.out.println();
        vrArgsForString("salom","hi","Helloooo");
        System.out.println();
        mixVarArgs("Mahmudkhon",20,"Studies at univer called Sejong where system sucks","I am learning java");
    }


}
