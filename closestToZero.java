//https://leetcode.com/problems/find-closest-number-to-zero/description/
public class closestToZero {
    public static void main(String[] args) {
        int[] nums={2,1,1,-1,100000};
        System.out.println(closestToZeros(nums));
    }
    static int closestToZeros(int[] nums){
        int[] freq=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            freq[i]=Math.abs(nums[i]);
        }
        int ans=Integer.MAX_VALUE;
        int index=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]<ans){
                index=i;
                ans=freq[i];
            } else if (ans==freq[i]) {
                if (nums[index]<nums[i]){
                    index=i;
                }
            }
        }
        return nums[index];
    }
}
