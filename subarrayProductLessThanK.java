//https://leetcode.com/problems/subarray-product-less-than-k/description/
public class subarrayProductLessThanK {
    public static void main(String[] args) {
        int[] nums={10,9,10,4,3,8,3,3,6,2,10,10,9,3};
        int k=19;
        System.out.println(numSubarrayProductLessThanK(nums,k));
    }
    static int numSubarrayProductLessThanK(int[] nums, int k) {
//        Approach
    //        Initialize variables: count (to keep track of the number of subarrays), product (to store the product of elements in the current window), and left (the left pointer of the window).
    //        Iterate over the array with a right pointer (right).
    //        Update the product by multiplying it with the current element (nums[right]).
    //        Shrink the window from the left side as long as the product is greater than or equal to k. Adjust the left pointer and update the product accordingly.
    //        Update the count by adding the size of the subarray (the number of subarrays ending at the current right index with a product less than k).
    //        Continue the process until the entire array is traversed.
    //        Return the final count.
//        Complexity
    //        Time complexity: O(n) - We iterate through the array once.
    //        Space complexity: O(1) - We use a constant amount of space for variables (count, product, left).
        if(k<=1)return 0;
        int l=0;
        int p=1;
        int c=0;
        for(int i=0;i<nums.length;i++){
            p*=nums[i];
            while(p>=k){
                p/=nums[l];
                l++;
            }
            c+=(i-l+1);
        }
        return c;
    }
}
