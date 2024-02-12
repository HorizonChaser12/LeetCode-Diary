import java.util.Arrays;

//https://leetcode.com/problems/minimum-number-of-operations-to-make-array-empty/description/
//https://leetcode.com/problems/minimum-rounds-to-complete-all-tasks/description/
//Both are same questions and have pretty same solution too.
public class minNoOfOperationsToEmpty {
    public static void main(String[] args) {
        int[] nums={14,12,14,14,12,14,14,12,12,12,12,14,14,12,14,14,14,12,12};
        System.out.println(minOperations(nums));
    }
    static int minOperations(int[] arr) {
//      Update 1:Passes 745/747 test cases but fails at the last 2 large test cases.
//      Update 2: passes all test cases and runs at 39ms
//        HashSet<Integer> set = new HashSet<>();
//        Arrays.sort(nums);
//        int count;
//        int ans=0;
//        int j=0;
//        while (j!=nums.length-1){
//            int k=j+1;
//            count=1;
//            if (!set.contains(nums[j])){
//                while (k < nums.length) {
//                    if (Objects.equals(nums[j], nums[k])) {
//                        count++;
//                        set.add(nums[j]);
//                    }
//                    else{
//                      break;
//                    }
//                    k++;
//                }
//                if (count%3==0){
//                    ans=ans+count/3;
//                }
//                else if(count%3==2 || count%3==1) {
//                    ans=ans+(count/3)+1;
//                }
//                else if (count%2==0) {
//                    ans=ans+count/2;
//                }
//            }
//            j++;
//        }
//        int check=0;
//        for (int num : nums) {
//            if (set.contains(num)) {
//                check++;
//            }
//        }
//        return check == nums.length ? ans:-1;


//       Passes all test cases and runs at 5ms
        int count=0,sum=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                else break;
            }
            if(count<2) return -1;
            else if(count%3==0)
                sum=sum+count/3;
            else
                sum=sum+ count/3 +1;

            i=i+count-1;
            count=0;
        }
        return sum;
    }
}
