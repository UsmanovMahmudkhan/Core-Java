package Leetcode;

public class Sequence {

    public static void main(String[] args) {
        System.out.println(isSubsequence("salom","assalomhasyt"));
    }
     public static boolean isSubsequence(String s, String t) {
            int i = 0, j = 0;
            while(i < s.length() && j < t.length()){
                if(s.charAt(i) == t.charAt(j)){
                    i++;
                }
                j++;
            }
            return i == s.length();
        }
    }

