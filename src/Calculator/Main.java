package Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        String input=null;
        Calculator c= new Calculator();
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("<<<<<<<<    Welcome to Mini CalCul    >>>>>>>>");
        System.out.println("Write your calculation here, Example: 3+3+3+3 , \n and then HIT ENTER button to see result");
        try {
             input=reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String[] nums = input.split("\\+|\\-|\\*|\\/");
        String[] ops = input.replaceAll("[0-9.]+", "").split("");

        List<Double> numbers = new ArrayList<>();
        for (String n : nums) numbers.add(Double.parseDouble(n));

        List<String> operators = new ArrayList<>();
        for (String o : ops) operators.add(o);


        for (int i = 0; i < operators.size(); ) {
            if (operators.get(i).equals("*") || operators.get(i).equals("/")) {
                double a = numbers.get(i);
                double b = numbers.get(i+1);
                double res = operators.get(i).equals("*") ? c.multiply(a,b) : c.div(a,b);
                numbers.set(i, res);
                numbers.remove(i+1);
                operators.remove(i);
            } else {
                i++;
            }
        }
        for (int i = 0; i < operators.size(); ) {
            double a = numbers.get(i);
            double b = numbers.get(i+1);
            double res = operators.get(i).equals("+") ? c.add(a,b) : c.subtract(a,b);
            numbers.set(i, res);
            numbers.remove(i+1);
            operators.remove(i);
        }

        System.out.println(numbers.get(0));
    }

    }



class Calculator implements Functions{

    @Override
    public double add(double... number) {
        double sum=0;
        for (double j : number) {
            sum += j;
        }
        return sum;
    }

    @Override
    public double subtract(double... number) {
        double result=number[0];
        for (int i=1;i< number.length;i++) {
            result = result-number[i];
        }
        return result;
    }

    @Override
    public double multiply(double... number) {
        double result=1;
        for (double j : number) {
            if (j == 0) {
                return 0;
            }
            result *= j;
        }

        return result;
    }

    @Override
    public double div(double... number) {
        double result=number[0];
        for (int i=1; i<number.length;i++) {

            if ( number[0] == 0) {
                return 0;
            }
            result =result/number[i];
        }

        return result;

    }


}
