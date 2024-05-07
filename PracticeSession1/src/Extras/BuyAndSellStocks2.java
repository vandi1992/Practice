package Extras;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
public class BuyAndSellStocks2 {
    public static void main(String[] args) {
        //int a[] =  new int[]{7,6,4,3,1};
        int a[] =  new int[]{3,3,5,0,0,3,1,4};
        System.out.println("All Profit:" +calculateAllProfit(a));
        System.out.println("All Profit:" +calculateAllProfitDP(a));
    }

    //DP Approach
    private static int calculateAllProfitDP(int[] a) {

        return 0;
    }

    //Direct Approach
    private static int calculateAllProfit(int[] a) {
         int profit = 0;
         int count = 0;
         for(int i=1;i<a.length;i++){
             if(a[i-1]<a[i] && count<2){
                 profit+=a[i]-a[i-1];
                 count++;
             }
         }

         return profit;

    }
}
