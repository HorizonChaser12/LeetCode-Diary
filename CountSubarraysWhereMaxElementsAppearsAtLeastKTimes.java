//https://leetcode.com/problems/count-subarrays-where-max-element-appears-at-least-k-times/
public class CountSubarraysWhereMaxElementsAppearsAtLeastKTimes {
    public static void main(String[] args) {
        int[] nums={1,3,2,3,3};
        int k=2;
        System.out.println(countSubarrays(nums,k));
    }
    static long countSubarrays(int[] nums, int k) {
        long count=0;
        int len=0;
        int L=0;
        int R=0;
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(nums[i],max);
        }
        while(R<n) {
            if (nums[R] == max) {
                len++;
            }
            if (len >= k) {
                while (len >= k) {
                    count += n - R;
                    if (nums[L] == max) {
                        len--;
                    }
                    L++;
                }
            }
            R++;
        }
        return count;
    }
}
