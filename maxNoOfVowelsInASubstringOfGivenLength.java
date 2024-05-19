//https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/
public class maxNoOfVowelsInASubstringOfGivenLength {
    public static void main(String[] args) {
        String s = "novowels";
        int k=1;
        System.out.println(maxVowels(s,k));

    }
    static int maxVowels(String s, int k) {
//        Problem with this code:
//        Use a sliding window technique to avoid recalculating the vowel count for overlapping segments.
//        Maintain the count of vowels as the window slides to avoid unnecessary re-computation.
//        int fast = k-1;
//        int slow = 0;
//        int max=0;
//        int count=0;
//        int counter=0;
//        while(slow<=fast && fast<s.length()){
//            while(counter<=fast){
//                if(s.charAt(counter)=='a' || s.charAt(counter)=='e' || s.charAt(counter)=='i' || s.charAt(counter)=='o' || s.charAt(counter)=='u'){
//                    count++;
//                }
//                counter++;
//            }
//            slow++;
//            fast++;
//            max=Math.max(max,count);
//            counter=slow;
//            count=0;
//        }
//        return max;


//      A better solution and solves the problems I got in my brute force one.
        int fast = k - 1;
        int slow = 0;
        int max;
        int count = 0;
        // Initialize count with the number of vowels in the initial window
        for (int i = 0; i <= fast; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }
        max = count;
        // Slide the window across the string
        while (fast < s.length() - 1) {
            fast++;
            if (isVowel(s.charAt(fast))) {
                count++;
            }
            if (isVowel(s.charAt(slow))) {
                count--;
            }
            slow++;
            max = Math.max(max, count);
        }
        return max;
    }
    // Helper method to check if a character is a vowel
    static private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
