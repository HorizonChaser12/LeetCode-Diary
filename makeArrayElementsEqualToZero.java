public class makeArrayElementsEqualToZero {
    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 0, 3};
        System.out.println(countValidSelections(nums));

    }

    static int countValidSelections(int[] nums) {
        int validSelections = 0;

        // Try each 0 position as start
        for (int curr = 0; curr < nums.length; curr++) {
            if (nums[curr] == 0) {
                // Try going left from this 0
                int[] leftCopy = nums.clone();
                goLeft(leftCopy, curr);
                if (checkAllZero(leftCopy)) {
                    validSelections++;
                }

                // Try going right from this 0
                int[] rightCopy = nums.clone();
                goRight(rightCopy, curr);
                if (checkAllZero(rightCopy)) {
                    validSelections++;
                }
            }
        }
        return validSelections;
    }

    static void goLeft(int[] nums, int index) {
        for (int i = index - 1; i >= 0; i--) {
            if (nums[i] > 0) {
                nums[i]--;
                goRight(nums, i);
                return;  // Stop after processing one non-zero number
            }
        }
    }

    static void goRight(int[] nums, int index) {
        for (int i = index + 1; i < nums.length; i++) {
            if (nums[i] > 0) {
                nums[i]--;
                goLeft(nums, i);
                return;  // Stop after processing one non-zero number
            }
        }
    }

    // Helper to check if all elements are zero
    private static boolean checkAllZero(int[] nums) {
        for (int num : nums) {
            if (num != 0) return false;
        }
        return true;
    }
}
