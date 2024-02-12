import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/fizz-buzz/
public class fizzBuzz {
    public static void main(String[] args) {
        int n=3;
        System.out.println(fizzBuzzs(n));
    }
    public static List<String> fizzBuzzs(int n) {
        List<String> list1=new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i%3==0 && i%5==0){
                list1.add("FizzBuzz");
            }
            else if (i%3==0){
                list1.add("Fizz");
            } else if (i%5==0) {
                list1.add("Buzz");
            }
            else {
                list1.add(String.valueOf(i));
            }
        }
        return list1;
    }
}
