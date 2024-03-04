//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class bestTimeToBuyStocks {
    public static void main(String[] args) {
        int[] nums={7, 1, 5, 4, 3, 6};
        System.out.println(maxProfit(nums));
    }
    public static int maxProfit(int[] prices) {
//        int max,min=Integer.MAX_VALUE;
//        int r=0;
//        for(int i=0;i<prices.length;i++){
//            if(prices[i]<min){
//                min=prices[i];
//            }
//            max=prices[i]-min;
//            if(r<max){
//                r=max;
//            }
//        }
//        return r;

//      Gotta increase my logic building more. I know what to do yet i complicate myself in doing tons of other things rather than going for the brute force method and improvising it to get the best result.
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<min){
                min=prices[i];
            }
            max=Math.abs(prices[i]-min);
        }
        return max;
    }
}
