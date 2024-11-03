//https://leetcode.com/problems/average-waiting-time/description/
public class averageWaitingTime {
    public static void main(String[] args) {
        int[][] arr = {
                {
                        5,2
                },
                {
                        5,4
                },
                {
                        10,3
                },
                {
                        20,1
                },
        };
        System.out.println(averageWaitingTimes(arr));
    }

    static double averageWaitingTimes(int[][] customers) {
        double average = 0.0;
        int currTime = customers[0][0];
        for (int i = 0; i < customers.length; i++) {
            int start = customers[i][0];
            if (customers[i][0]>currTime){
                currTime=start+customers[i][1];
            }
            else {
                currTime=currTime+customers[i][1];
            }
            average +=currTime-start;
        }
        return average/customers.length;
    }
}
