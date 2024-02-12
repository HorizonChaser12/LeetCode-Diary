//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
//Doubt need to learn again
public class indexOfFirstOccurString {
    public static void main(String[] args) {
        String s="sadbutsad";
        String s2="sad";
        System.out.println(strStr(s,s2));
    }
    public static int strStr(String haystack, String needle) {
        int i=0;
        for (int k = 0; k < haystack.length(); k++) {
            if(needle.charAt(k)==haystack.charAt(i)){
                i++;
            }
            else {
                k=k-i;
            }
            if (i==needle.length()){
                return k-needle.length()+1;
            }
        }

        return -1;
    }
}
