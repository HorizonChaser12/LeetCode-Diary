//https://leetcode.com/problems/remove-all-occurrences-of-a-substring/description/?envType=daily-question&envId=2025-02-11
import java.util.Stack;

public class removeAllOccurrencesOfASubstring {
    public static void main(String[] args) {
        String s = "daabcbaabcbc", part = "abc";
        System.out.println(removeOccurrences(s,part));
    }
    static String removeOccurrences(String s, String part) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        int m = part.length();
        for(int i=0;i<n;i++){
            st.push(s.charAt(i));
            if(st.size()>=m){
                String x="";
                for(int j=m-1;j>=0;j--){
                    char ch = part.charAt(j);
                    if(ch!=st.peek()){
                        for(int k=0;k<x.length();k++){
                            st.push(x.charAt(k));
                        }
                        break;
                    }
                    else{
                        x=st.peek()+x;
                        st.pop();
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while(st.size()!=0){
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}
