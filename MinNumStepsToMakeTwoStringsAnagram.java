import java.util.Arrays;
//https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/description/?envType=daily-question&envId=2024-01-13
public class MinNumStepsToMakeTwoStringsAnagram {
    public static void main(String[] args) {
        String s = "leetcode", t = "practice";
        System.out.println(minSteps(s,t));
    }
    static int minSteps(String s, String t) {
        int steps=0;
        int[] first = new int[26];
        int[] second = new int[26];
        char[] char1 = s.toCharArray();
        char[] char2 = t.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        for (int i = 0; i < s.length(); i++) {
            first[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            second[t.charAt(i)-'a']++;
        }
        System.out.println(Arrays.toString(char1));
        System.out.println("Original " + Arrays.toString(first));
        System.out.println(Arrays.toString(char2));
        System.out.println("Duplicat " + Arrays.toString(second));
        for (int i = 0; i < first.length; i++) {
                if (first[i]>second[i]){
                    steps = steps + Math.abs(first[i]-second[i]);
                }
            }
        return steps;
    }
}
