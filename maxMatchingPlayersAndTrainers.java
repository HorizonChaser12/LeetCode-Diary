import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//https://leetcode.com/problems/maximum-matching-of-players-with-trainers/description/
public class maxMatchingPlayersAndTrainers {
    public static void main(String[] args) {
        int[]players = {4,7,9}, trainers = {8,2,5,8};
        System.out.println(matchPlayersAndTrainers(players,trainers));
    }
    static int matchPlayersAndTrainers(int[] players, int[] trainers) {
        List<Integer> list = new ArrayList<>();
        for (int trainer : trainers) {
            list.add(trainer);
        }
        int count=0;
        int j=0,i=0;
        Arrays.sort(players);
        Collections.sort(list);
        while(i<players.length && j<trainers.length){
            if(players[i] <= list.get(j)){
                i++;
                j++;
                count++;
            }
            else if(players[i] > list.get(j)){
                j++;
            }
            }
        return count;

//        A better 2 pointer approach with less runtime
//        Arrays.sort(trainers);
//        Arrays.sort(players);
//
//        int res=0;
//        int i=0, j=0;
//        while(i<players.length && j<trainers.length){
//            if(players[i] <= trainers[j]){
//                i++;
//                j++;
//                res++;
//            } else if(players[i] > trainers[j]){
//                j++;
//            }
//        }
//        return res;
    }
}
