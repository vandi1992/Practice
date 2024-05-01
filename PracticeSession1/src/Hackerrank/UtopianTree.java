package Hackerrank;

import java.util.Scanner;

public class UtopianTree {

   // Problem : https://www.hackerrank.com/challenges/utopian-tree/problem
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int totalTestCases = sc.nextInt();
        for(int i=0;i<totalTestCases;i++) {
            int cycle = sc.nextInt();
            System.out.println(utopianTree(cycle));
        }
    }

    private static int utopianTree(int n) {
        //Using bitwise operators
        return (1<<(n>>1)+1)-1<<n%2;
    }
    /*
    //Second approach:
    private static int utopianTree(int n)
    {
        int height=0;
        int term = 1;
        //1 Term = 2 cycles
        // Formula : Term(n) = 2^(n+1)-1
        //If n = odd then subtract 1 from the above formula

        if(n%2==0){
            //using term formula
            term = n/2;
            height = (int) Math.pow(2,term+1)-1;

        }
        else {
            term = (n/2)+1;
            height = (int) Math.pow(2,term+1)-2;

        }

        return height;
    }



     */
    /* brute force approach
    private static int utopianTree(int n)
    {
        int height=0;
        for(int i=0;i<=n;i++){
            if(i%2==0){
                height++;
            }
            else{
                height=height*2;
            }
        }
        return height;
    }

     */
}
