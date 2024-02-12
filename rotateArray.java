import java.util.Arrays;
//https://leetcode.com/problems/rotate-array/description/
public class rotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);
        System.out.println(Arrays.toString(nums));
    }
    static void rotate(int[] nums, int k) {
    int n=nums.length;
    k=k%n;
    reversepart(nums,0,n-1);
    reversepart(nums,0,k-1);
    reversepart(nums,k,n-1);
}
    static void reversepart(int[] nums,int s ,int e){
        int temp;
        while(s<e){
            temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
    }
}
