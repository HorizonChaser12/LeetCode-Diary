import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/minimum-time-difference/
public class minTimeDifference {
    public static void main(String[] args) {
        String[] arr = {"23:59","00:00"};
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(findMinDifference(list));
    }
    static int findMinDifference(List<String> timePoints) {
//      https://leetcode.com/problems/minimum-time-difference/solutions/5792274/1440-mins-in-1-day-explained-with-video-c-java-python-js-count-total-minutes-explained/
//      Got help from discussion till the last of finding the min,but couldnt solve what the cyclic it was.The above solution explains it really well.
        int min = Integer.MAX_VALUE;
        int[] mins = new int[timePoints.size()];
        for(int i=0;i<timePoints.size();i++){
            String time = timePoints.get(i);
            String[] parts =time.split(":");
            mins[i]=Integer.parseInt(parts[0])*60+Integer.parseInt(parts[1]);
        }
        Arrays.sort(mins);
        for(int i=0;i<mins.length-1;i++){
                min=Math.min(min,(mins[i+1]-mins[i]));
        }
        return Math.min(
                min,
                24 * 60 - mins[mins.length - 1] + mins[0]
        );
    }
}
