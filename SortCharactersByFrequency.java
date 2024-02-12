//https://leetcode.com/problems/sort-characters-by-frequency/description/?envType=daily-question&envId=2024-02-07
public class SortCharactersByFrequency {
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }
    static String frequencySort(String s) {
        char[] char1 = s.toCharArray();
        int[] freq = new int[128];
        for (int i = 0; i <char1.length; i++) {
            freq[char1[i]]++;
        }
        for (int i = 0; i <char1.length;) {
            char cmax=',';
                for(int j=0;j<128;j++){
                    if(freq[j]>freq[cmax]) {
                        cmax=(char)j;
                    }
                }
            while(freq[cmax]!=0){
                char1[i++]=cmax;
                freq[cmax]--;
            }
        }
        return new String(char1);
    }
}
