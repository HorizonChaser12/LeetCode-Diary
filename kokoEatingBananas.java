//https://leetcode.com/problems/koko-eating-bananas/description/
//At first I couldn't think of how binary search can be applied into it but later on through solutions I got to know about what is the low and high variables for the binary search to happen.
public class kokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = {30,11,23,4,20};
        int h = 5;
        System.out.println(minEatingSpeed(piles,h));
    }
    static int minEatingSpeed(int[] piles, int h) {
//       Brute Force Approach 114 / 126 testcases passed
        int max=Integer.MIN_VALUE;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
//        for (int i = 1; i <=max ; i++) {
//            int hourSum = 0;
//            int j = 0;
//            while (j<piles.length){
//                hourSum+=Math.ceilDiv(piles[j],i);
//                j++;
//            }
//            if (hourSum<=h){
//                return i;
//            }
//        }
//        return -1;


//       Binary Search approach
        int low = 1;
        int high = max;
        while (low<high){
            int mid = (low+high)/2;
            if (isPossible(piles,h,mid)){
                high=mid;
            }
            else {
                low=mid+1;
            }
        }
        return low;
    }
    private static boolean isPossible(int[] piles, int h, int mid){
        int ans = 0;
        for (int pile : piles) {
            ans += pile / mid;
            if (pile % mid != 0) {
                ans++;
            }
        }
        return ans <= h;
    }
}
