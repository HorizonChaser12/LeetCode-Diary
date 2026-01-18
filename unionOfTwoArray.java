import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class unionOfTwoArray {
    public static void main(String[] args) {
        int[] nums1= {1,4,4,6,7};
        int[] nums2= {4};
        ArrayList<Integer> ans = findUnion(nums1,nums2);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }

    }
    static ArrayList<Integer> findUnion(int nums1[], int nums2[]) {
//        HashSet
//        HashSet<Integer> set = new HashSet<>();
//        for(int i=0;i<nums1.length;i++){
//            set.add(nums1[i]);
//        }
//        for(int i=0;i<nums2.length;i++){
//            set.add(nums2[i]);
//        }
//        ArrayList<Integer> list = new ArrayList<>(set);
//        Collections.sort(list);
//        return list;

//      Two Pointer
        int num1 = 0;
        int num2 = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int prev = -1;
        while(num1< nums1.length && num2<nums2.length) {
            
        }
        return list;
    }
}
