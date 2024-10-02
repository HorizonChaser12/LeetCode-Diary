import java.util.*;
//https://leetcode.com/problems/rank-transform-of-an-array/description/?envType=daily-question&envId=2024-10-02
public class rankTransformOfArray {
    public static void main(String[] args) {
        int[] arr = {40,10,20,30};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }
    static int[] arrayRankTransform(int[] arr) {
//       Fails on the last test case cuz of 2 loops working.
//       You cant actually pass the last test case without using the hashmap as the last case has a very long input and O(n^2) wont work on that.
//        int[] nums = Arrays.copyOf(arr,arr.length);
//        Arrays.sort(arr);
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (!list.contains(arr[i])){
//                list.add(arr[i]);
//            }
//        }
//        int[] newarr = new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            newarr[i]=list.get(i);
//        }
//        int[] ans = new int[arr.length];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < newarr.length; j++) {
//                if (nums[i]==newarr[j]){
//                    ans[i]=j+1;
//                    break;
//                }
//            }
//        }
//        return ans;


//       HashMap Code
        int[] nums = new int[arr.length];
        int[] nums1 = Arrays.copyOf(arr, arr.length);
        int rank = 1;
        Arrays.sort(arr);
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],rank);
                rank++;
            }
        }

        for(int i=0;i<nums1.length;i++){
            nums[i] = map.get(nums1[i]);
        }

        return nums;
    }
}
