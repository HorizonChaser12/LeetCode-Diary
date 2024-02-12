import java.util.Arrays;
//Majority did it by hashmap, but I still tried to find a solution that doesn't use it.
//https://leetcode.com/problems/count-nice-pairs-in-an-array/description/?envType=daily-question&envId=2023-11-21

public class countNicePairs {
    public static void main(String[] args) {
        int[] nums={13,10,35,24,76};
        System.out.println(countNicePairss(nums));
    }
    static int countNicePairss(int[] nums) {
        final int mod=1000000007;
        int len=nums.length;
        for(int i=0;i<len;i++){
            nums[i]=nums[i]-reverse(nums[i]);
        }
        Arrays.sort(nums);
        long res=0;
        for(int i=0;i<len-1;i++){
            long count=1;
            while(i<len-1 && nums[i]==nums[i+1]){
                count++;
                i++;
            }
            res=(res%mod+(count*(count-1))/2)%mod;
        }
        return (int)(res%mod);
    }
    static int reverse(int n){
        int rev=0;
        while(n>0){
            rev=(n%10)+rev*10;
            n=n/10;
        }
        return rev;
    }
}
