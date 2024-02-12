import java.util.Arrays;
import java.util.HashMap;
//https://leetcode.com/problems/top-k-frequent-elements/description/
public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k=2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }
    static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] ans = new int[k];
        for(int i=0;i<nums.length;i++){
            int count = hm.getOrDefault(nums[i], 0);
            hm.put(nums[i], count + 1);
        }
        System.out.println(Arrays.asList(hm));
        int j=0;
        int index=0;
        while(j!=k){
            int max=0;
            for (int i = 1; i < hm.size(); i++) {
                if (hm.get(i)>max){
                    max=hm.get(nums[i]);
                    index=nums[i];
                }
            }
            ans[j]=max;
            hm.put(index, 0);
            j++;
        }
        return ans;
    }
}
