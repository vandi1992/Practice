package Topics.Recursion;

public class PrintNumReverse {
    static int i =1;
    public static void main(String[] args) {
        int N = 5;
        printNumRev(N);
    }

    private static void printNumRev(int N) {
        if(N<=0){
            return;
        }
        System.out.println(N);
        printNumRev(N-1);
    }


    //Backtracking.
    private static void printNumRevBT(int N) {
        if(N<0){
            return;
        }
        System.out.println(N);
        printNumRev(N-1);
    }
}