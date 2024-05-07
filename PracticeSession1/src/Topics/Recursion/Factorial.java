package Topics.Recursion;

public class Factorial {
    public static void main(String[] args) {
        int N = 6;
         fact(1,N);
        //  summationFunctional(0,N);
        System.out.println("From Functional Print sum : " +factFun(1,N));

    }

    private static int factFun(int i, int n) {
        if(n==1){
            return 1;
        }
        return n*factFun(i,n-1);
    }

    private static void fact(int i, int n) {
        if(n<=1){
            System.out.println("Factor: "+i);
            return;
        }
        i*=n;
        fact(i,n-1);
    }
}
