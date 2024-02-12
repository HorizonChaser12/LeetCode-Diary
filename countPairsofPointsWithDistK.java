import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/count-pairs-of-points-with-distance-k/description/
public class countPairsofPointsWithDistK {
    public static void main(String[] args) {
        List<List<Integer>> coordinates = new ArrayList<>();
        coordinates.add(new ArrayList<>(List.of(1, 3)));
        coordinates.add(new ArrayList<>(List.of(1, 3)));
        coordinates.add(new ArrayList<>(List.of(1, 3)));
        coordinates.add(new ArrayList<>(List.of(1, 3)));
        coordinates.add(new ArrayList<>(List.of(1, 3)));
        int k=0;
        System.out.println(countPairs(coordinates,k));
    }
    static int countPairs(List<List<Integer>> coordinates, int k) {
//        Fails for the large constraints of coordinates.
//        Okay,Update: The question is very tough with only use of for loops and can only be achieved using HashMap to solve it in O(nlogn) complexity.
        int n = coordinates.size();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int x1 = coordinates.get(i).get(0);
            int y1 = coordinates.get(i).get(1);
            for (int j = i + 1; j < n; j++) {
                int x2 = coordinates.get(i+1).get(0);
                int y2 = coordinates.get(i+1).get(1);
                int x = (x1 ^ x2);
                int y = (y1 ^ y2);
                if (x + y == k) {
                    count++;
                }
            }
        }
        return count;

//        This is a solution that gets accepted but has a high runtime despite there are no more good solution to it.
//        int res = 0;
//        HashMap<Integer, HashMap<Integer, Integer>> hm = new HashMap<>();
//        // similar to 2Sum
//        for (List<Integer> p : coordinates) {
//            int x1 = p.get(0), y1 = p.get(1);
//            for (int x = 0; x <= k; x++) {
//                int x2 = x1 ^ x;
//                int y2 = y1 ^ (k - x);
//                //Suppose that x = x1 XOR x2 and y = y1 XOR y2 then we can get x2 = x XOR x1 and y2 = y XOR y1.
//                //We are supposed to have k = x + y so we can get x2 = x XOR x1 and y2 = (k - x) XOR y1.
//                //We can iterate over all possible values of x and count the number of points (x1, x2) and (x2, y2).
//                if (hm.containsKey(x2) && hm.get(x2).containsKey(y2)) res += hm.get(x2).get(y2);
//
//
//
//            }
//
//
//
//            hm.computeIfAbsent(x1, x -> new HashMap<>()).put(y1, hm.get(x1).getOrDefault(y1, 0) + 1);
//
//
//
//            // OR
//
//
//
//            // if (!hm.containsKey(x1)) {
//            //     HashMap<Integer, Integer> map = new HashMap<>();
//            //     hm.put(x1, map);
//            //     hm.get(x1).put(y1, hm.get(x1).getOrDefault(y1, 0) + 1);
//            // } else {
//            //     hm.get(x1).put(y1, hm.get(x1).getOrDefault(y1, 0) + 1);
//            // }
//        }
//        return res;
    }
}

