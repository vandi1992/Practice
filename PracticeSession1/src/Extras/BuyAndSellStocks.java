package Extras;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class BuyAndSellStocks {
    public static void main(String[] args) {
        int a[] =  new int[]{7,1,5,3,6,4};
        System.out.println("Profit1:" +calculateProfit1(a));
        System.out.println("Profit2:" +calculateProfit2(a));
    }

    //Slower + mem consuming
    private static int calculateProfit2(int[] a) {
        int profit = 0;
        int buyValue = a[0];
        for(int i=1;i<a.length;i++) {
            int cost = a[i]-buyValue;
            profit = Math.max(profit,cost);
            buyValue = Math.min(buyValue,a[i]);
        }
        return profit;
    }

    //Faster + less mem
    private static int calculateProfit1(int[] a) {
        int buyValue = a[0];
        int profit = Integer.MIN_VALUE;
        for(int i=1;i<a.length;i++){
            if(buyValue-a[i]>0){
                buyValue=a[i];
            }
            else
            {
                if(profit<a[i]-buyValue){
                    profit = a[i]-buyValue;
                }
            }
        }
        return profit>0?profit:0;
    }


}
