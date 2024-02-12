import java.util.Arrays;

//https://leetcode.com/problems/number-of-employees-who-met-the-target/
public class noOfEmployeesWhoMetTarget {
    public static void main(String[] args) {
        int[] hours = {5,1,4,2,2};
        int target = 6;
        System.out.println(numberOfEmployeesWhoMetTarget(hours,target));
    }
    static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        Arrays.sort(hours);
        int i=0;
        while (i<hours.length && hours[i]<target){
            i++;
        }
        return Math.max(hours.length  - i, 0);
    }
}
