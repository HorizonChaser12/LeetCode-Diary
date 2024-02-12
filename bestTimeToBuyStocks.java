//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class bestTimeToBuyStocks {
    public static void main(String[] args) {
        int[] nums={2,4,1};
        System.out.println(maxProfit(nums));
    }
    public static int maxProfit(int[] prices) {
        int max,min=Integer.MAX_VALUE;
        int r=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            max=prices[i]-min;
            if(r<max){
                r=max;
            }
        }
        return r;
    }
}
