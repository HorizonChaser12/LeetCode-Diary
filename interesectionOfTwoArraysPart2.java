import java.util.*;
//https://leetcode.com/problems/intersection-of-two-arrays-ii/
public class interesectionOfTwoArraysPart2 {
    public static void main(String[] args) {
        int[] nums1 = {3,1,2};
        int[] nums2 = {1,1};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();
        if (nums1.length>nums2.length){
            int[] temp=nums1;
            nums1=nums2;
            nums2=temp;
        }
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i]==nums2[j]) {
                    ans.add(nums1[j]);
                    nums2[j] = -1;
                    break;
                }
            }
        }
        int[] arr = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++)
            arr[i] = ans.get(i);
        return arr;
    }
}
