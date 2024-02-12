import java.util.HashSet;
//https://leetcode.com/problems/count-the-number-of-consistent-strings/description/
//Have to work on my solution using hash set.
public class countNoOfConsistentStrings {
    public static void main(String[] args) {
        String allowed = "abc";
        String[] words = {"a","b","c","ab","ac","bc","abc"};
        System.out.println(countConsistentStrings(allowed,words));
    }
    static int countConsistentStrings(String allowed, String[] words) {
        int count;
        int ans=0;
        HashSet<Character> set= new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            set.clear();
            count=0;
            for (int j = 0; j < words[i].length(); j++) {
                set.add(words[i].charAt(j));

            }
            int k=0;
            while (k!=allowed.length()){
                if (set.contains(allowed.charAt(k))){
                     count++;
                }
                else {
                    break;
                }
                if (count>0){
                    ans++;
                }
                k++;
            }
        }
        return ans;
    }
}
