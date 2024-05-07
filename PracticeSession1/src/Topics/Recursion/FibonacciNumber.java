package Topics.Recursion;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(calcFibNumber(n));
    }

    public static int calcFibNumber(int n){
        if(n==0)
            return 0;
        if(n==1||n==2)
            return 1;

        return (calcFibNumber(n-1)+calcFibNumber(n-2));

    }
}
