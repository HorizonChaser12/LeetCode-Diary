//https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced/description/
public class minimumNoOfSwapsToMakeStringBalanced {
    public static void main(String[] args) {
        String s = "]]][[[";
        System.out.println(minSwaps(s));
    }
    static int minSwaps(String s) {
        int imbalance = 0;
        int swapCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==']' && imbalance!=0){
                imbalance--;
            } else if (s.charAt(i)=='[') {
                imbalance++;
            } else{
                imbalance++;
                swapCount++;
            }
        }
        return swapCount;
    }
}
