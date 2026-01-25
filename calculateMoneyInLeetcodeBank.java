public class calculateMoneyInLeetcodeBank {
    public static void main(String[] args) {
        int n = 20;
        System.out.println(totalMoney(n));
    }
    static int totalMoney(int n) {
//      O(N) solution...can be done in constant time using Maths
        int ans = 0;
        int days = 0 ;
        int j = 0;
        for(int i =0;i<=7;i++){
            for (int k = i+1; k <= 7+j; k++) {
                ans += k;
                days++;
                if (days==n){
                    return ans;
                }
            }
            j++;
        }
        return -1;

    }
}
