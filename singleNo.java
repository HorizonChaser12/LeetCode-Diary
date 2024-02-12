import java.util.Arrays;
import java.util.HashSet;

//https://leetcode.com/problems/single-number/
//Need of bitwise operators!Need to learn

//Intuition
//        XORing a number with itself results in 0 (A ^ A = 0).
//        XORing any number with 0 leaves it unchanged (A ^ 0 = A).
//        XORing is commutative and associative, so the order of XOR operations doesn't matter.
//
//        Approach
//        Initialize a variable result to 0.
//        Iterate through the array and perform XOR between result and each element.
//        The final value of result will be the unique element that appears only once.
//
//        Complexity
//        Time complexity:
//        The time complexity is O(n), where
//        n is the number of elements in the array. This is because we iterate through the array once.
//        Space complexity:
//        The space complexity is O(1) because we use only a constant amount of extra space. The XOR operation is performed in-place without using additional data structures.
public class singleNo {
    public static void main(String[] args) {
        int[] arr = {1,1,2,4,2};
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int result=0;
        for(int i=0;i<nums.length;i++){
            result^= nums[i];
        }
        return result;
    }
}
