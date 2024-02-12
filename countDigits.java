import java.util.ArrayList;
import java.util.List;
//https://www.codingninjas.com/studio/problems/count-digits_8416387?leftPanelTabValue=PROBLEM
public class countDigits {
    public static void main(String[] args) {
        int n=660;
        System.out.println(countDigitss(n));
    }
    static int countDigitss(int n){
        // Write your code here.
        int original=n;
        int count=0;
        List<Integer> list = new ArrayList<>();
        while(n!=0){
            list.add(n%10);
            n=n/10;
        }
        for(int i=0;i<list.size();i++){
            if(list.get(i)!=0 && original%list.get(i)==0){
                count++;
            }
        }
        return count;
    }
}
