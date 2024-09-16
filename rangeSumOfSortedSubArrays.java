import java.util.Arrays;
//https://leetcode.com/problems/range-sum-of-sorted-subarray-sums/description/
public class rangeSumOfSortedSubArrays {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int n= nums.length;
        int left=1,right=5;
        System.out.println(rangeSum(nums,n,left,right));
    }
    static int rangeSum(int[] nums, int n, int left, int right) {
        int sum = 0 ;
        int[] sumsubarray = new int[n*(n+1) / 2];
        int pointer = 0;
        int L=0,R=1;
        while(L<R && L< nums.length){
            sumsubarray[pointer]=nums[L];
            sum=nums[L];
            pointer++;
            while(R<nums.length){
                sum=sum+nums[R];
                sumsubarray[pointer]=sum;
                pointer++;
                R++;
            }
            L++;
            R=L+1;
        }
        Arrays.sort(sumsubarray);
        sum=0;
        final int mod = (int) 1e9 + 7;
        for (int i = left-1; i < right; i++) {
            sum=(sum+sumsubarray[i]) % mod;
        }
        return sum;
    }
}
