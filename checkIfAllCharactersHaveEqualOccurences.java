import java.util.HashSet;
//https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/description/
public class checkIfAllCharactersHaveEqualOccurences {
    public static void main(String[] args) {
        String s = "vvvvvvvvvvvvvvvvvvv";
        System.out.println(areOccurrencesEqual(s));
    }
    static boolean areOccurrencesEqual(String s) {
        int[] freq = new int[200];
        HashSet<Character> set = new HashSet<>();
        int dis=0;
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                dis++;  set.add(s.charAt(i));
            }
            freq[s.charAt(i)-'a']++;
        }
        int counter = 0;
        int occur = 0;
        for(int i=0;i<freq.length;i++){
            if(occur==0 && freq[i]!=0){
                occur=freq[i];
            }
            if(freq[i]!=0 && occur==freq[i]){
                counter++;
            }
        }
        return counter==dis;
    }
}
