package Topics.Recursion;
//Summation of first N numbers
public class Summation {
    public static void main(String[] args) {
        int N = 6;
       // summation(0,N);
      //  summationFunctional(0,N);
        System.out.println("From Functional Print sum : " +sumFun(0,N));

    }

   /* private static void summationFunctional(int i, int n) {
    }

    */

    private static int sumFun(int i, int n) {
        if(n<0){
            return 0;
        }
        return n+sumFun(i,n-1);
    }

    //Parameterised
    private static void summation(int sum,int n) {
        if(n<0){
            System.out.println("Sum: "+sum);
            return;
        }
        sum+=n;
        summation(sum,n-1);

    }

}
