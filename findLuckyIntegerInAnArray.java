//https://leetcode.com/problems/find-lucky-integer-in-an-array/description/?envType=daily-question&envId=2025-07-05
public class findLuckyIntegerInAnArray {
    public static void main(String[] args) {
            int[] arr = {2,2,2,3,3};
        System.out.println(findLucky(arr));
    }
    static int findLucky(int[] arr) {
        int[] freq = new int[501];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        int max =-1;
        for (int i = 0; i < arr.length; i++) {
            if (freq[arr[i]]==arr[i]){
                max=Math.max(max,arr[i]);
            }
        }
        return max;
    }
}
