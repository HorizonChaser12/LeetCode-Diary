//https://leetcode.com/problems/add-digits/description/
public class addDigits {
    public static void main(String[] args) {
        int n=1;
        System.out.println(addDigit(n));
    }
    public static int addDigit(int num) {
        if (num<10){
            return num;
        }
        int sum=0;
        while (num>9){
            sum=0;
            while (num!=0){
                sum=num%10 + sum;
                num=num/10;
            }
            num=sum;
        }
        return sum;
    }
}
