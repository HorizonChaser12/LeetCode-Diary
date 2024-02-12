//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
public class bestTimeToBuyStocks2 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    static int maxProfit(int[] prices) {
        int max=0,min=0;
        int minsofar=prices[0];
        int sum=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }


        }

        return sum;
    }
}
