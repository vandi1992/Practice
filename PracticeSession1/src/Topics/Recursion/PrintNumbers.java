package Topics.Recursion;

//Print Linearly from 1 -> N
public class PrintNumbers {
    static int i =1;
    public static void main(String[] args) {
        int N = 5;
        printNum(0,N);
        printNumBackTrack(N);
    }
    //Backtracking.
    private static void printNumBackTrack(int n) {
        if(n<1){
            return;
        }
       // n--;
        printNumBackTrack(n-1);
        System.out.println(n);

    }

    //Using Recursion
    private static void printNum(int i,int N) {
        if(i>N){
            return;
        }
        System.out.println(i);
        i++;
        printNum(i,N);
    }
}
