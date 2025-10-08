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

        Factorial factorial=(number)->{
          int result=1;
          for(int i=2;i<=number;i++){
              result*=i;
          }
          return result;
        };

        System.out.println(factorial.fact(5));
    }
}

interface StringReverse{
    String reverse(String input);
}

interface Factorial{
    int fact(int number);
}
