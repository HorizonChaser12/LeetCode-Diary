import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/maximum-distance-in-arrays/description/
public class maximumDistanceInArrays {
    public static void main(String[] args) {
        List<List<Integer>> arrays = new ArrayList<>();
        List<Integer> one = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> two = new ArrayList<>(Arrays.asList(4, 5));
        List<Integer> three = new ArrayList<>(Arrays.asList(1, 2, 3));
        arrays.add(one);
        arrays.add(two);
        arrays.add(three);
        System.out.println(maxDistance(arrays));

    }

    static int maxDistance(List<List<Integer>> arrays) {
        int smallest = arrays.get(0).get(0);
        int biggest = arrays.get(0).get(arrays.get(0).size() - 1);
        int maxDistance = 0;

        for (int i = 1; i < arrays.size(); i++) {
            maxDistance = Math.max(maxDistance, Math.abs(arrays.get(i).get(arrays.get(i).size() - 1) - smallest));
            maxDistance = Math.max(maxDistance, Math.abs(biggest - arrays.get(i).get(0)));
            smallest = Math.min(smallest, arrays.get(i).get(0));
            biggest = Math.max(biggest, arrays.get(i).get(arrays.get(i).size() - 1));
        }

        return maxDistance;
    }
}
