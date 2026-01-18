//https://leetcode.com/problems/check-if-any-element-has-prime-frequency/description/?envType=problem-list-v2&envId=array
public class checkIfAnyElementHasPrimeFrequency {
    public static void main(String[] args) {
        int[] nums = {0,3,0,4};
        System.out.println(checkPrimeFrequency(nums));
    }
    static boolean checkPrimeFrequency(int[] nums) {
        int[] freq = new int[101];
        for(int i = 0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            if(isPrime(freq[i])){
                return true;
            }
        }
        return false;

    }
    static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        for(int i = 2;i * i <=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
