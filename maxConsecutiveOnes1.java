//https://leetcode.com/problems/max-consecutive-ones/
public class maxConsecutiveOnes1 {
    public static void main(String[] args) {
        int[] arr={1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
//        int count=0;
//        int max=0;
//        for (int num : nums) {
//            if (num != 0) {
//                count++;
//                if (max < count) {
//                    max = count;
//                }
//            } else {
//                count = 0;
//            }
//        }
//        return max;

//        Using sliding window!
        int max=Integer.MIN_VALUE;
        int len;
        int R=0;
        int L=0;
        int n = nums.length;
        while(R<n){
            if (nums[R]!=1){
                L=R+1;
                R=R+1;
            }
            else{
                len=R-L+1;
                max=Math.max(len,max);
                R++;
            }
        }
        return max==Integer.MIN_VALUE ? 0 : max;
    }
}
