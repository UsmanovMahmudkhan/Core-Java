package CoreConcept;

public class Lambda {
    public static void main(String[] args)  {
       StringReverse reverse=(some)->{
           String result = "";
           for(int i=some.length()-1;i>=0;i--){
               result+=some.charAt(i);
           }
           return result;
       };

        System.out.println(reverse.reverse("Salom"));

    }
}

interface StringReverse{
    String reverse(String input);
}
