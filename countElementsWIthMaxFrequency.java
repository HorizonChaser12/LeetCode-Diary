//https://leetcode.com/problems/count-elements-with-maximum-frequency/description/?envType=daily-question&envId=2024-03-08
public class countElementsWIthMaxFrequency {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,1,4};
        System.out.println(maxFrequencyElements(nums));
    }
    static int maxFrequencyElements(int[] nums) {
        int max=0;
        int count=0;
        int[] freq = new int[101];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>max){
                max=freq[i];
            }
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==max){
                count=count+freq[i];
            }
        }
        return count;
    }
}
