//https://leetcode.com/problems/number-of-segments-in-a-string/description/
public class noOfSegmentsInString {
    public static void main(String[] args) {
        String s = "Hello, my name is John";
        System.out.println(countSegments(s));
    }
    public static int countSegments(String s) {
        char prev=' ';
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' ' && prev==' ' ) count++;
            prev= s.charAt(i);
        }

        return count;
    }
}
