//https://leetcode.com/problems/majority-element/description/
import java.util.Arrays;
import java.util.HashSet;

public class majorityEle {
    public static void main(String[] args){
        int[] nums={3,2,3};
        System.out.println(majorityElement(nums));
    }
//    public static int majorityElement(int[] nums) {
//        int count;
//        if(nums.length==1){
//            return nums[0];
//        }
//        for (int num : nums) {
//            count = 0;
//            for (int j = 1; j < nums.length; j++) {
//                if (num == nums[j]) {
//                    count++;
//                }
//            }
//            if (count >= nums.length / 2){
//                return num;
//            }
//        }
//        return 0;
//    }


//    Using HashMap better 1ms Runtime
//    HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i=0;i<nums.length;i++){
//        map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//    }
//         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//        if (entry.getValue() > nums.length / 2) {
//            return entry.getKey();
//        }
//    }
//        return -1;

//    Better Runtime method!
    public static int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        int n= nums.length;
//        return nums[nums.length/2];

        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            count = 0;
            if(!set.contains(nums[i])){
                for(int j=0;j<nums.length;j++){
                    if(nums[i]==nums[j]){
                        count++;
                        if(count>nums.length/2){
                            return nums[i];
                        }
                    }
                }
                set.add(nums[i]);
            }
        }
        return -1;
    }

}
