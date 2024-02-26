import java.util.Arrays;
//https://leetcode.com/problems/rotate-array/description/
//Solutions are full of these same codes and rather than giving intuition behind it they just copy paste, i added the answer so that when i am able to find the different answer , I can compare it . Basically i think this can be done using two pointers too.
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
    static void reversepart(int[] nums,int s ,int e) {
        int temp;
        while (s < e) {
            temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
}
