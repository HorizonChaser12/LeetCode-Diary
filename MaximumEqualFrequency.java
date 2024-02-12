import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MaximumEqualFrequency {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,5,3,3,5};
        System.out.println(maxEqualFreq(nums));
    }
    static int maxEqualFreq(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        System.out.println(Arrays.asList(map));
        return list.size();
    }
}
