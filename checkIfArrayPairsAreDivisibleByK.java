import java.util.Arrays;

//https://leetcode.com/problems/check-if-array-pairs-are-divisible-by-k/description/
public class checkIfArrayPairsAreDivisibleByK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,10,6,7,8,9};
        int k = 5;
        System.out.println(canArrange(arr,k));
    }
    static boolean canArrange(int[] arr, int k) {
//     The goal is to pair elements in the array such that the sum of each pair is divisible by a given integer ( k ). For two integers ( a ) and ( b ), their sum ( (a + b) ) is divisible by ( k ) if the sum of their
//     remainders when divided by ( k ) is either ( k ) or ( 0 ). This leads us to consider the remainders of each element when divided by ( k ).
//     https://leetcode.com/problems/check-if-array-pairs-are-divisible-by-k/solutions/5854226/can-you-pair-these-numbers-beats-100-explained-with-video-c-java-python-js-explained/
//     Check this link to know the whole story.
        int [] freq = new int[k];
        for(int num: arr){
            int rem = num % k;
            if(rem < 0){
                rem = rem + k;
            }
            freq[rem]++;
        }
        System.out.println(Arrays.toString(freq));
        if(freq[0] % 2 != 0){
            return false;
        }
        for(int i = 1;i <= k / 2;i++){
            if(freq[i] != freq[k-i]) {
                return false;
            }
        }
        return true;
    }
}
