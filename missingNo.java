//https://leetcode.com/problems/missing-number/
public class missingNo {
    public static void main(String[] args) {
        int[] nums={9,6,4,2,3,5,7,0,1};
        int ans=missingNumber(nums);
        System.out.println(ans);
    }
    public static int missingNumber(int[] arr) {
//        int sum=0,realsum=0;
//        for (int i = 1; i < nums.length+1; i++) {
//                sum=sum+i;
//        }
//        for (int num : nums) {
//            realsum += num;
//        }
//        return sum-realsum;

//        Cycle sort approach
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if (arr[i]<arr.length && arr[i]!=arr[correct]){
                int temp=arr[correct];
                arr[correct]= arr[i];
                arr[i]=temp;
            }
            else {
                i++;
            }
            }
        for (int index=0;index<arr.length;index++){
            if (arr[index]!=index){
                return index;
            }
        }
        return arr.length;
    }
}
