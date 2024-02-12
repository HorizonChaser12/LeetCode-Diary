//https://leetcode.com/problems/sum-of-number-and-its-reverse/description/
public class sumofNoandItsReverse {
    public static void main(String[] args) {
        int num=0;
        System.out.println(sumOfNumberAndReverse(num));
    }
    static boolean sumOfNumberAndReverse(int num) {
        for(int i=0;i<=num;i++){
//            for(int i=num/2; i <= num-(num/6);i++){
//            Apparently this start and end loop is better in terms of runtime and is beneficially faster than O(n).
            int num2=reversenumber(i);
            if(i+num2==num){
                return true;
            }
        }
        return false;
    }
    static int reversenumber(int n){
        int reversed=0;
        while(n!=0){
            int temp=n%10;
            n=n/10;
            reversed=temp+reversed*10;
        }
        return reversed;
    }
}
