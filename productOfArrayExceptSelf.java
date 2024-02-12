import java.util.Arrays;
//https://leetcode.com/problems/product-of-array-except-self/description/


// Personal Intuition : The usual O(n) method of calculating product again and again until all the elements are traversed.
// Intuition got from Discussion page: Creation of right product array and left product array.
// How to Solve:
//      Create 2 arrays:RIGHTPRODUCT and LEFTPRODUCT
//      Initialise the first element of RIGHTPRODUCT to 1  otherwise the product will always be . Same for the last element of LEFTPRODUCT.
//      The formula for calculating the next products for LEFTPRODUCT : The previous product of the elements behind it with the product of the element behind the element that needs to be calculated next.
//                                                        RIGHTPRODUCT : The next product of the elements to the right with that of the product of the element that needs to be calculated next.
//      In a new array multiply both LEFTPRODUCT elements and RIGHTPRODUCT elements to get the product of Array Except Self.

//https://www.youtube.com/watch?v=tSRFtR3pv74
//For better clarification you should watch the YouTube video above.


public class productOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    static int[] productExceptSelf(int[] nums) {
        int[] ans= new int[nums.length];

        int[] prefix= new int[nums.length];
        prefix[0]=1;
        for(int i=1 ;i<ans.length;i++){
            prefix[i] = prefix[i-1]*nums[i-1];
        }

        int[] suffix = new int[nums.length];
        suffix[nums.length-1]=1;
        for (int i = nums.length-2; i >= 0; i--) {
            suffix[i]= suffix[i+1] * nums[i+1];
        }
        for (int i = 0; i < ans.length; i++) {
                ans[i]=prefix[i]*suffix[i];
        }
        return ans;
    }
}
