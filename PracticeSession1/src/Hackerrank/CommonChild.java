package Hackerrank;

import java.util.Arrays;
//Longest common subsequence

public class CommonChild {
    static Integer [][] dp;
    static int[][] cache;

    public static void main(String args[]) {
        String s1 = "HrdRY";
        String s2 = "larry";
        dp = new Integer[s1.length() + 1][s2.length() + 1];
       // int dp[][] = new int[s1.length()][s2.length()];
        for (Integer[] row : dp) {
            Arrays.fill(row, -1);
        }

     /*  Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

      */
       // System.out.println(evaluateCommonChild1(s1.toLowerCase(),s2.toLowerCase(),s1.length(),s2.length()));
       // System.out.println(evaluateCommonChild2(s1.toLowerCase(),s2.toLowerCase(),s1.length(),s2.length(),dp));
        System.out.println(evaluateCommonChild3(s1.toLowerCase(),s2.toLowerCase(),s1.length(),s2.length()));//,0,0));
    }


    //using Dynamic Programming - bottom up approach| TC= O(m*n) | SC = O(m*n)
    public static int evaluateCommonChild3(String s1, String s2, int m , int n)
    {
        int memo[][]= new int[m+1][n+1];
        for(int i =0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0||j==0){
                    memo[i][j]=0;
                }
                else if(s1.charAt(i-1)==s2.charAt(j-1)){
                    memo[i][j]=1+memo[i-1][j-1];
                }
                else {
                    memo[i][j]=Math.max(memo[i-1][j], memo[i][j-1]);
                }
            }
        }
        cache = memo;
        return memo[m][n];
    }

    //using Recursion and memoization - Top down approach
    public static int evaluateCommonChild2(String s1, String s2, int m , int n, Integer[][] dp){
        if(m<=0||n<=0)
            return 0;

        if(dp[m][n]!= -1)
            return dp[m][n];

        if(s1.charAt(m-1) == s2.charAt(n-1))
        {
            return 1+evaluateCommonChild2(s1,s2,m-1,n-1,dp);
        }
        else
        {
            return dp[m][n] =
                    Math.max(evaluateCommonChild2(s1, s2, m, n - 1, dp), evaluateCommonChild2(s1, s2, m - 1, n, dp));
        }
    }

    //using Recursion - Top down approach
    public static int evaluateCommonChild1(String s1, String s2, int m , int n){
        if(m<=0||n<=0) {
            return 0;
        }
        else if(s1.charAt(m-1) == s2.charAt(n-1)){
            return 1+evaluateCommonChild1(s1,s2,m-1,n-1);
        }
        else
            return Math.max(evaluateCommonChild1(s1,s2,m,n-1),evaluateCommonChild1(s1,s2,m-1,n));
    }


}
