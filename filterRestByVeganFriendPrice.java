import java.util.ArrayList;
import java.util.List;

public class filterRestByVeganFriendPrice {
    public static void main(String[] args) {
        int[][] restaurants = {
                {1, 4, 1, 40, 10},
                {2, 8, 0, 50, 5},
                {3, 8, 1, 30, 4},
                {4, 10, 0, 10, 3},
                {5, 1, 1, 15, 1},
        };
        int veganFriendly = 1, maxPrice = 50, maxDistance = 10;
        System.out.println(filterRestaurants(restaurants,veganFriendly,maxPrice,maxDistance));
    }
    static List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        List<Integer> list = new ArrayList<>();
        for (int row = 0; row < restaurants.length; row++) {
            for (int col = 0; col < restaurants[row].length; col++) {
                if(restaurants[row][2]==veganFriendly){

                }
            }
        }
        return list;
    }
}
