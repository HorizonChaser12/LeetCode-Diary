//https://leetcode.com/problems/sum-of-beauty-of-all-substrings/description/
public class sumOfBeautyOfAllSubstrings {
    public static void main(String[] args) {
        String s = "aabcb";
        System.out.println(beautySum(s));
    }
    static int beautySum(String s) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] alpha = new int[26];
            for (int j = i; j < s.length(); j++) {
                alpha[s.charAt(j)-'a']++;
                max = findMax(alpha);
                min = findMin(alpha);
                count+=max-min;
            }
        }
        return count;
    }
    static int findMax(int[] arr ){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0) {
                max = Math.max(max, arr[i]);
            }
        }
        return max;
    }
    static int findMin(int[] arr ){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0){
                min= Math.min(min,arr[i]);
            }
        }
        return min;

//      Works better and is comparatively more logical and less time complexity.
//        int count = 0;
//        for (int i = 0; i < s.length(); i++) {
//            int[] alpha = new int[26];
//            for (int j = i; j < s.length(); j++) {
//                alpha[s.charAt(j)-'a']++;
//                int max=Integer.MIN_VALUE;
//                int min=Integer.MAX_VALUE;
//                for(int k=0;k<26;k++){
//                    if(alpha[k]>0){
//                        min=Math.min(min,alpha[k]);
//                        max=Math.max(max,alpha[k]);
//                    }
//                }
//                count+=max-min;
//            }
//        }
//        return count;
    }
}
