import java.util.HashSet;
//https://www.naukri.com/code360/problems/count-with-k-different-characters_1214627?leftPanelTabValue=PROBLEM
public class countWithKDifferentCharacters {
    public static void main(String[] args) {
        String str = "qffds";
        int k=4;
        System.out.println(countSubStrings(str,k));
    }
    static int countSubStrings(String str, int k) {
        // Write your code here.
        int count = 0;
        int limit=0;
        int L=0,R=0;
        HashSet<Character> set = new HashSet<>();
        while(L<str.length()){
            while(R<str.length()){
                if(!set.contains(str.charAt(R))){
                    set.add(str.charAt(R));
                    limit++;
                }
                if(limit==k){
                    count++;
                    R++;
                    while(R<str.length() && set.contains(str.charAt(R))){
                        R++;
                        count++;
                    }
                    set.clear();
                    limit=0;
                    L++;
                    R=L;
                    continue;
                }
                R++;
            }
            L=R;
        }
        return count;
    }
}
