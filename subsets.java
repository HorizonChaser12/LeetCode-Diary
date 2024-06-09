import java.util.ArrayList;
import java.util.List;

public class subsets {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subsetss(nums));
    }
    static List<List<Integer>> subsetss(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> empty = new ArrayList<>();
        List<Integer> full = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!full.contains(nums[i])){
                full.add(nums[i]);
            }
        }
        list.add(empty);
        List<Integer> hehe;
        for(int i=0;i<nums.length;i++){
            if(!list.contains(nums[i])){
                hehe = new ArrayList<>();
                hehe.add(nums[i]);
                list.add(hehe);
            }
        }
        list.add(full);
        return list;
    }
}
