import java.util.Arrays;
//https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/description/?envType=daily-question&envId=2024-12-18
public class finalPriceWithASpecialDiscountInAShop {
    public static void main(String[] args) {
        int[] prices = {8,4,6,2,3};
        System.out.println(Arrays.toString(finalPrices(prices)));
    }
    static int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if (prices[j]<=prices[i]){
                    prices[i]-=prices[j];
                    break;
                }
            }
        }
        return prices;
    }
}
