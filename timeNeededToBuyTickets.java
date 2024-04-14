public class timeNeededToBuyTickets {
    public static void main(String[] args) {
        int[] nums = {84,49,5,24,70,77,87,8};
        int k = 3 ;
        System.out.println(timeRequiredToBuy(nums,k));
    }
    static int timeRequiredToBuy(int[] tickets, int k) {
//        3 ms runtime. Pretty basic code ,does it work but there are more efficient ways for this program to run.
//        int ans=0;
//        for(int i=0;i<tickets.length;i++){
//            if(tickets[i]>0 && tickets[k]!=0){
//                tickets[i]--;
//                ans++;
//            }
//            if(tickets[k]!=0 && i==tickets.length-1){
//                i=-1;
//            }
//        }
//        return ans;

//       1ms runtime
        int ele=tickets[k];
        int out=0;
        for(int i=0;i<tickets.length;i++) {
            if(tickets[i]>=ele) {
                if(i<=k)
                    out=out+ele;
                else
                    out=out+ele-1;
            }
            else {
                out=out+tickets[i];
            }
        }
        return out;
    }
}
