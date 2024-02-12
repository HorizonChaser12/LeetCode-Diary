//https://leetcode.com/problems/final-value-of-variable-after-performing-operations/

public class finalValueAfterOperation {
    public static void main(String[] args) {
        String[] str={"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(str));
    }
    public static int finalValueAfterOperations(String[] operations) {
        int X=0;
        for (String operation : operations) {
            if (operation.equals("++X") || operation.equals("X++")) {
                X = X + 1;
            } else if (operation.equals("--X") || operation.equals("X--")) {
                X = X - 1;
            }
        }
        return X;
    }
}
