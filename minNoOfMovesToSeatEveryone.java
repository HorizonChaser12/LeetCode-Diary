import java.util.Arrays;
//https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/description/
public class minNoOfMovesToSeatEveryone {
    public static void main(String[] args) {
        int[] seats = {3,1,5,}, students = {2,7,4};
        System.out.println(minMovesToSeat(seats,students));

    }
    static int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int count=0;
        for(int i=0;i<students.length;i++){
                if (students[i] != seats[i]) {
                    count = count + Math.abs(students[i] - seats[i]);
                }
            }
        return count;
    }
}
