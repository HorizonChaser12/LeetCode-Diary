//https://leetcode.com/problems/find-the-original-typed-string-i/?envType=daily-question&envId=2025-07-01
public class findTheOriginalTypedString1 {
    public static void main(String[] args) {

    }
    static int possibleStringCount(String word) {
        int count = 0;
        for(int i=0;i<word.length()-1;i++){
            if(word.charAt(i)==word.charAt(i+1)){
                count++;
            }
        }
        return count+1;
    }
}
