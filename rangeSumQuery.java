
public class rangeSumQuery {
    public static void main(String[] args) {
        
    }

    class NumArray {
    int[] ans;
    public NumArray(int[] nums) {
        ans = new int[nums.length+1];
        ans[0] = 0;
        for(int i = 1;i<=nums.length;i++){
            ans[i]=ans[i-1]+nums[i-1];
        }
    }

    public int sumRange(int left, int right) {
        return ans[right+1]-ans[left];
    }
    }
}
