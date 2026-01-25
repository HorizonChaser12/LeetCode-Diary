import java.util.Arrays;
import java.util.HashSet;

//https://leetcode.com/problems/set-mismatch/description/
public class setMismatch {
    public static void main(String[] args) {
        int[] nums={3,2,2};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    public static int[] findErrorNums(int[] nums) {
//        int i = 0;
//        while (i < arr.length) {
//            int correct = arr[i] - 1;
//            if (arr[i] != arr[correct]) {
//                int temp = arr[correct];
//                arr[correct] = arr[i];
//                arr[i] = temp;
//            } else {
//                i++;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        int miss=0;
//        int repeat=0;
//        for(int j=0;j<arr.length;j++){
//            if(arr[j]!=j+1){
//                repeat=arr[j];
//                miss=j+1;
//            }
//        }
//        return new int[]{repeat,miss};

        int[] ans = new int[2];
        int n = nums.length;
        int ActualSum = (n * (n+1)) / 2;
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                ans[0]=nums[i];
                break;
            }
            else{
                set.add(nums[i]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        ans[1]= ActualSum - (sum - ans[0]);
        return ans;
    }
}
