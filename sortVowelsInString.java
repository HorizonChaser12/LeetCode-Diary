import java.util.*;
//https://leetcode.com/problems/sort-vowels-in-a-string/description/?envType=daily-question&envId=2023-11-13
public class sortVowelsInString {
    public static void main(String[] args) {
        String s = "lEetcOde";
        System.out.println(sortVowels(s));
    }
    static String sortVowels(String s) {
//        Got accepted but has a high runtime of 900ms due to multiple traversal of the string.
//        List<Character> vowels= new ArrayList<>();
//        vowels.add('a');
//        vowels.add('e');
//        vowels.add('i');
//        vowels.add('o');
//        vowels.add('u');
//        vowels.add('A');
//        vowels.add('E');
//        vowels.add('I');
//        vowels.add('O');
//        vowels.add('U');
//        List<Character> list= new ArrayList<>();
//        for(int i=0;i<s.length();i++){
//            if (vowels.contains(s.charAt(i))) {
//                list.add(s.charAt(i));
//            }
//        }
//        Collections.sort(list);
//        int k=0;
//        String ans="";
//        for (int i = 0; i < s.length(); i++) {
//            if (vowels.contains(s.charAt(i))) {
//                ans = ans + list.get(k);
//                k++;
//            }
//            else {
//                ans=ans+s.charAt(i);
//            }
//
//        }
//        return ans;

//      Runs at 49 ms now.Best Solution till of now and beats 60% users.
        HashSet<Character> vowels= new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        List<Character> list= new ArrayList<>();
        List<Integer> position = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if (vowels.contains(s.charAt(i))) {
                list.add(s.charAt(i));
                position.add(i);
            }
        }
        Collections.sort(list);
        char[] og=s.toCharArray();
        for (int i = 0; i < position.size(); i++) {
            og[position.get(i)]=list.get(i);
        }
        return new String(og);
    }
}
