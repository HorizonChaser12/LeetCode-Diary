//https://leetcode.com/problems/take-gifts-from-the-richest-pile/submissions/?envType=daily-question&envId=2024-12-12
import java.util.Arrays;
public class takeGiftsFromTheRichestPile {
    public static void main(String[] args) {
        int[] gifts = {25, 64, 9, 4, 100};
        int k = 4;
        System.out.println(pickGifts(gifts, k));
    }

    static long pickGifts(int[] gifts, int k) {
//      A very not optimal/brute force solution that does pass whole test cases but not worth it.
//      My first solution was using the Arrays.sort function multiple times under the whole loop.
//      26ms runtime

//      This code in other place uses the normal linear time sorting to find the largest number to square root and thus is better than the Arrays.sort function.
//      Takes 5ms runtime.
        long ans = 0;
        int maxIndex=0;
        while (k!=0){
            int max=Integer.MIN_VALUE;
            for (int i = 0; i < gifts.length; i++) {
                if (gifts[i]>max){
                    max=gifts[i];
                    maxIndex=i;
                }
            }
            gifts[maxIndex]=(int)Math.sqrt(gifts[maxIndex]);

            k--;
        }
        for (int i = 0; i < gifts.length; i++) {
            ans += gifts[i];
        }
        return ans;
    }
}
