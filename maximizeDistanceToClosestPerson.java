public class maximizeDistanceToClosestPerson {
    public static void main(String[] args) {
        int[] seats = {1,0,0,0};
        int[] seats2= {0,0,0,1};
        System.out.println(maxDistToClosest(seats));
    }
    static int maxDistToClosest(int[] seats) {
        int ans = 0;
        int pointer1 = 0;
        int pointer2= 0;
        while(pointer1<seats.length && pointer2<seats.length){
            if (pointer1!=1){
                while (pointer2<seats.length && seats[pointer2]!=1){
                    pointer2++;
                }
                ans = Math.max(ans,Math.min(pointer2,pointer1));
            }
            else {
                while (pointer2<seats.length && seats[pointer2]!=1){
                    pointer2++;
                }
                ans = Math.max(ans,Math.min(pointer2,pointer1));
            }

            pointer1 = pointer2;
            pointer2++;
        }
        return ans;
    }

}
