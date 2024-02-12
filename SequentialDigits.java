import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//https://leetcode.com/problems/sequential-digits/description/?envType=daily-question&envId=2024-02-02
public class SequentialDigits {
    public static void main(String[] args) {
        int low=10,high=1000000000;
        System.out.println(sequentialDigits(low,high));
    }
    static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        String a = "123456789";
        int L=0;
        int R=1;
        while(R<a.length()){
            while (R<a.length()+1){
                int number = Integer.parseInt(a.substring(L,R));
                if (number>=low && number<=high){
                    list.add(number);
                }
                if (number>high){
                    L++;
                    R=L+1;
                }
                else {
                    R++;
                }
            }
            L++;
            R=L+1;
        }
        Collections.sort(list);
        return list;
    }
}
