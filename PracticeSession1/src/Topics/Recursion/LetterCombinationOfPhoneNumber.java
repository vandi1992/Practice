package Topics.Recursion;

import java.util.ArrayList;

public class LetterCombinationOfPhoneNumber {
    static String[] keypad= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static ArrayList<String> aList = new ArrayList<>();
    public static void main(String[] args){
        String x= "894";
        String ans = "";
        possibleCombinations(x,ans);
        System.out.println(aList);
    }

    private static void possibleCombinations(String x, String ans) {

        if(x.length()==0) {
            aList.add(ans);
            return;
        }

        String key = keypad[x.charAt(0)-48];
        for(int i=0;i<key.length();i++){
            possibleCombinations(x.substring(1),ans+key.charAt(i));
        }
    }
}
