//https://leetcode.com/problems/binary-subarrays-with-sum/description/
public class BinarySubarraysWithSum {
    public static void main(String[] args) {
//        int[] nums = {0,0,0,0,0};
//        int goal=0;
        int[] nums = {1,0,1,0,1};
        int goal=2;
        System.out.println(numSubarraysWithSum(nums,goal));
    }
    static int numSubarraysWithSum(int[] nums, int goal) {
//        int L=0,R=0;
//        int count=0,sum=0,temp=0;
//        while(R<nums.length){
//            sum+=nums[R];
//            if (nums[R] == 1) temp = 0;
//            if (sum > goal) {
//                sum -= nums[L];
//                L++;
//            }
//            while(sum==goal && L<=R){
//                temp++;
//                sum-=nums[L];
//                L++;
//            }
//            R++;
//            count += temp;
//        }
//        return count;


//      Tried it again and without taking any kind of help, although its very slow and resource+ space consumption is high.
//       I am happy that I can solve it within some minutes or so.
        int left = 0;
        int right = 0;
        int count=0;
        while(left<nums.length){
            int sum =0;
            while(right<nums.length){
                sum=sum+nums[right];
                if(sum==goal){
                    count++;
                }
                if(sum>goal){
                    break;
                }
                right++;
            }
            left++;
            right=left;
        }
        return count;
    }
}
