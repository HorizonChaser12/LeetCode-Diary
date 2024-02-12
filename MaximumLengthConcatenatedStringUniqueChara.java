import java.util.*;

public class MaximumLengthConcatenatedStringUniqueChara {
    public static void main(String[] args) {
        String[] str= {"cha","r","act","ers"};
        List<String> arr = Arrays.asList(str);
        System.out.println(maxLength(arr));
    }
    static int maxLength(List<String> arr) {
        if(arr.size()==1){
            return arr.size();
        }
        int max=0;
        String s=arr.get(0);
        String previousS="";
        Set <Character> set= new HashSet<>();
        for(int i=1;i<arr.size();i++){
            for (int j = 0; j < arr.get(i).length(); j++) {
                char[] char1 = arr.get(i).toCharArray();
                if(!set.contains(char1[j])){
                    set.add(char1[j]);
                    s=s+char1[j];
                }
                else{
                    s=previousS;
                    break;
                }
            }
            previousS=arr.get(i-1);
            max=Math.max(max,s.length());
        }
        return max;
    }
}
