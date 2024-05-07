package Topics.Recursion;

import java.util.*;


public class Subsequences {

    static ArrayList<String> aList =new ArrayList<>();

    public static void main(String args[]) {
        String s = "abc";
        String ans = "";
        String[] stringArray2 = new String[(int) Math.pow(2,s.length())];   //Declarartion by specifying the size
        calcSubsequence(s,ans);
        System.out.println(aList);
        //calcSubsequence(s,ans);

    }

    public static void calcSubsequence(String s, String a){
        if(s.length()==0){
            //System.out.println(a);
            aList.add(a);
            return;
        }
        calcSubsequence(s.substring(1),a+s.charAt(0));
        calcSubsequence(s.substring(1),a);
    }
}
