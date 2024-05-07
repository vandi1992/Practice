package Topics.Recursion;

public class Palindrome {
    public static void main(String[] args){
        String s = "racecar";
        System.out.println(s + checkPalindrome(s));
    }

    private static String checkPalindrome(String s) {
        if(s.length()==0||s.length()==1)
            return " is a palindrome";

        if(s.charAt(0)!=s.charAt(s.length()-1))
            return " is not a palindrome";

        return checkPalindrome(s.substring(1,s.length()-1));
    }
}
