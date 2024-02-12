//https://leetcode.com/problems/find-maximum-number-of-string-pairs/
public class findMaxNoStringPair {
    public static void main(String[] args) {
        String[] words = {"cd","ac","dc","ca","zz"};
        System.out.println(maximumNumberOfStringPairs(words));
    }
    static int maximumNumberOfStringPairs(String[] words) {
        int count=0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                if (words[i].charAt(0)==words[j].charAt(1)){
                    if (words[i].charAt(1)==words[j].charAt(0)){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
