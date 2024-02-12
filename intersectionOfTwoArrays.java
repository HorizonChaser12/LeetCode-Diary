import java.util.*;

//https://leetcode.com/problems/intersection-of-two-arrays/
//High runtime but good resource management
public class intersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {5,10,15,5,10};
        int[] nums2 = {15,5,5,10,4};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
//        using normal for loops
//        List<Integer> ans=new ArrayList<>();
//        for (int k : nums1) {
//            for (int i : nums2) {
//                if (k == i && checkDuplicay(ans, k)) {
//                    ans.add(k);
//                    break;
//                }
//            }
//        }
//        int[] arr=new int[ans.size()];
//        for (int i = 0; i < ans.size(); i++)
//            arr[i] = ans.get(i);
//        return arr;
//    }
//    static boolean checkDuplicay(List<Integer> ans,int value){
//        for (Integer an : ans) {
//            if (value == an) {
//                return false;
//            }
//        }
//        return true;



//        Using hashmap
        Set<Integer> set =new HashSet<>();
        int count=0;
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])){
                count++;
                set.remove(i);
            }
        }
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index] = num;
            index++;
        }
        return result;
    }
}
