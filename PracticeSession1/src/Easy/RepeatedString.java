package Easy;

import java.util.Arrays;

public class RepeatedString {


    public static void main(String args[]){
        String s = "aba";
        long repeat = 10;
        System.out.println(repeatACount(s,repeat));

    }

    private static long repeatACount(String s, long repeat) {
        long aCount=0;
        for(int  i =0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                aCount++;
            }
        }

        if(aCount==0)
            return 0;

        aCount = aCount*(repeat/s.length());

        long remainingChar = repeat%s.length();
        if(remainingChar!=0){
            for(int i=0;i<remainingChar;i++){
                if(s.charAt(i)=='a'){
                    aCount++;
                }
            }
        }

        return aCount;


      /*
      Brute force:

      char aValue = 'a';
        long aCount = 0;

        StringBuilder newString = new StringBuilder();
        int appendCounter=0;
        while(newString.length()<repeat){
            newString.append(s.charAt(appendCounter));
            appendCounter++;
            if(appendCounter==s.length()){
                appendCounter=0;
            }
        }
        System.out.println("New String : " +newString.toString());

        for(int  i =0;i<newString.length();i++){
            if(newString.charAt(i)=='a'){
                aCount++;
            }
        }


        return aCount;
        */

    }
}
