package InterviewQuestions;

//input - aabaccbaadc output - a5b2c3d1


import java.util.ArrayList;
import java.util.List;

public class Q5 {
    public static void main(String[] args) {
        String a="aabaccbaadc";
        StringBuilder ans= new StringBuilder();
        int[] freq=new int[10000001];
        List<Character> set = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
            if (!set.contains(a.charAt(i))){
                set.add(a.charAt(i));
            }
            if (set.contains(a.charAt(i))){
                freq[set.indexOf(a.charAt(i))]++;
            }
        }
        for (int i = 0; i < set.size(); i++) {
            ans.append(set.get(i)).append(freq[i]);
        }
        System.out.println(ans);
    }
}
