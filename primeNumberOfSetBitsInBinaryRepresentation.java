// https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/description/?envType=daily-question&envId=2026-02-21
public class primeNumberOfSetBitsInBinaryRepresentation {

    public static void main(String[] args) {
            int left = 842;
            int right = 888;
            System.out.println(countPrimeSetBits(left, right));
        
    }

    static int countPrimeSetBits(int left, int right) {
        // int[] nums = new int[right-left+1];
        // int index = 0;
        // for (int i = left; i <= right; i++) { 
        //     String conv = Integer.toBinaryString(i);
        //     int temp = 0;
        //     for (int j = 0; j < conv.length(); j++) {
        //         if (conv.charAt(j) == '1') {
        //             temp++;   
        //         }
        //     }
        //     nums[index] = temp;
        //     index++;
        // }
        // int count = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     if (isPrime(nums[i])) {
        //         count++;
        //     }
        // }
        // return count;
        int count = 0;
        for (int i = left; i <= right; i++) {
            int temp = 0;
            int num = i;
            while (num>0) {
                if (num%2==1) {
                    temp++;
                }
                num=num/2;
            }
            if (isPrime(temp)) {
                count++;
            }
        }
        return count;
    }
    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
}