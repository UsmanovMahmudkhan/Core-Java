package Basic_problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class StinOut {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());

        String name = br.readLine();
        System.out.println(n*2);
        System.out.println("Hi, " + name + ".");
    }
}
