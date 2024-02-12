//https://leetcode.com/problems/count-prefixes-of-a-given-string/description/
public class countPrefix {
    public static void main(String[] args) {
        String[] words = {"ycwj","hak","v","kjg","zw","vtes","vom","ii","as","v","vo","v","w","vomy","loa","fbm","j","v","vo","e","y","t","eh","yk","bt","x","vomy","vom","yab","v","sydi","wnb","z","v","iygp","vomy"};
        String s = "vomy";
        System.out.println(countPrefixes(words,s));
    }

////Naive Approach
    static int countPrefixes(String[] words, String s) {
        int ans=0;
        for (String word : words) {
            int count = 0;
            int j = 0;
            if (word.length() <= s.length() && word.charAt(j) == s.charAt(j)) {
                j++;
                while (j < word.length() && word.charAt(j) == s.charAt(j)) {
                    count++;
                    j++;
                }
                if (j < word.length() && word.charAt(j) != s.charAt(j)){
                   continue;
                }
                if (count <= s.length()) {
                    ans++;
                }
            }
        }
        return ans;
    }

//    Best Approach
//    static int countPrefixes(String[] words, String s) {
//        int count = 0;
//        for (String i : words)
//            if (s.startsWith(i)) count++;
//        return count;
//    }
}

