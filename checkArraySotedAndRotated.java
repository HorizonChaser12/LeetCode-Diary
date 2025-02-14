//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
public class checkArraySotedAndRotated {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(isSorted(nums));
    }
    static boolean isSorted(int[] a) {
        // Write your code here.
        int count=0;
        for(int i=0;i<a.length;i++){
            System.out.println(a[(i+1) % a.length]);
            if(a[i]>a[(i+1) % a.length]){
                count++;
            }
        }
        return count <= 1;
    }
}

//Let's take an example to understand how it works:
//        Input: nums = [3,4,5,1,2]
//
//        In the first iteration, a[0] (3) is compared with a[(0+1) % 5] (4), and it's true that 3 is less than 4.
//
//        In the second iteration, a[1] (4) is compared with a[(1+1) % 5] (5), and it's true that 4 is less than 5.
//
//        In the third iteration, a[2] (5) is compared with a[(2+1) % 5] (1), and it's false that 5 is less than 1.
//
//        So, count becomes 2, which is not greater than 1, and the code returns true as expected because the array can be obtained by rotating a sorted array.
