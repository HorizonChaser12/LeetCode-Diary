import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class closestPrimeNumbersInRange {
    public static void main(String[] args) {
        int left = 18, right = 72;
        System.out.println(Arrays.toString(closestPrimes(left,right)));
    }
    static int[] closestPrimes(int left, int right) {
//       1652ms due to checking if the number is prime multiple times.
        List<Integer> list = new ArrayList<>();
        for (int i = left; i < right+1; i++) {
            if(isPrime(i)){
                list.add(i);
            }
        }
        if (list.size()<=1) {
            return new int[]{-1, -1};
        }
        int sub = Math.abs(list.get(0)-list.get(1));
        int first= list.get(0), second=list.get(1);
        for (int i = 1; i < list.size()-1; i++) {
            if (Math.abs(list.get(i)-list.get(i+1))<sub){
                sub=Math.abs(list.get(i)-list.get(i+1));
                first =list.get(i);
                second=list.get(i+1);
            }
        }
        return sub==0 ? new int[]{-1,-1} : new int[]{first,second};
    }
    static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
