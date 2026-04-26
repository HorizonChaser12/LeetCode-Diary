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
//        HashMap<Integer,Integer> hm = new HashMap<>();
//        int[] ans = new int[k];
//        for(int i=0;i<nums.length;i++){
//            int count = hm.getOrDefault(nums[i], 0);
//            hm.put(nums[i], count + 1);
//        }
//        System.out.println(Arrays.asList(hm));
//        int j=0;
//        int index=0;
//        while(j!=k){
//            int max=0;
//            for (int i = 1; i < hm.size(); i++) {
//                if (hm.get(i)>max){
//                    max=hm.get(nums[i]);
//                    index=nums[i];
//                }
//            }
//            ans[j]=max;
//            hm.put(index, 0);
//            j++;
//        }
//        return ans;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int[] freq = new int[max - min + 1];

        for (int num : nums) {
            freq[num - min]++;
        }
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            int maxIndex = 0;
            for (int j = 0; j < freq.length; j++) {
                if (freq[j] > freq[maxIndex]) {
                    maxIndex = j;
                }
            }
            ans[i] = maxIndex + min;
            freq[maxIndex] = 0;
        }
        return ans;
    }
}
