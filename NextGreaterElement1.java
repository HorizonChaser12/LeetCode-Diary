import java.util.Arrays;
import java.util.Stack;

//https://leetcode.com/problems/next-greater-element-i/description/
public class NextGreaterElement1 {
    public static void main(String[] args) {
        int[] nums1 ={2,4},nums2={1,2,3,4};
        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
    }
    static int[] nextGreaterElement(int[] nums1, int[] nums2) {
//        BruteForce
        int k;
        int[] ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j]==nums1[i]){
                    k=j+1;
                    ans[i]=-1;
                    while (k!=nums2.length ){
                        if (nums2[k]>nums1[i]){
                            ans[i]=nums2[k];
                            break;
                        }
                        k++;
                    }
                }
            }
        }
        return ans;
    }
}
