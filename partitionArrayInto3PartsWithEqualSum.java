//https://leetcode.com/problems/partition-array-into-three-parts-with-equal-sum/
//Ok so the catch in this question was quite simple it was that the sum of the total elements in the array would be equal to the sum of the equally divided subarrays.
public class partitionArrayInto3PartsWithEqualSum {
    public static void main(String[] args) {
        int[] num = {1,-1,1,-1};
        System.out.println(canThreePartsEqualSum(num));
    }
    static boolean canThreePartsEqualSum(int[] arr) {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        if(sum%3!=0){
            return false;
        }
        int ans=sum/3;
        int sum1=0,sum2=0,sum3=0;
        int L=0;
        while (L<arr.length){
            sum1+=arr[L];
            if (sum1==ans){
                L++;
                while(L<arr.length){
                    sum2+=arr[L];
                    L++;
                    if (sum2==ans){
                        while(L<arr.length){
                            sum3+=arr[L];
                            L++;
                            if (sum3==ans){
                                return true;
                            }
                        }
                    }
                }

            }
            L++;
        }
        return false;
    }
}
