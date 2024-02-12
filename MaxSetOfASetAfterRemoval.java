import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
//https://leetcode.com/problems/maximum-size-of-a-set-after-removals/solutions/
public class MaxSetOfASetAfterRemoval {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5,6};
        int[] nums2 = {2,3,2,3,2,3};
        System.out.println(maximumSetSize(nums1,nums2));
    }

    static int maximumSetSize(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            list1.add(nums1[i]);
            list2.add(nums2[i]);
        }
        for (int i = 0; i < list1.size(); i++) {
            if (list2.contains(nums1[i])) {
                set.add(list1.get(list1.indexOf(nums1[i])));
                list1.remove(list1.indexOf(nums1[i]));

            }
            if (list1.contains(nums2[i])) {
                set.add(list2.get(list2.indexOf(nums2[i])));
                list2.remove(list2.indexOf(nums2[i]));
            }
        }
        for (int i = 0; i < Math.max(list1.size(),list2.size()); i++) {
            if (list1.size() != nums1.length/2 ){
                set.add(list1.get(list1.size()-1));
            }
            if (list2.size() != nums2.length/2){
                set.add(list2.get(list2.size()-1));
            }
        }
        return set.size();
    }
}
