//https://leetcode.com/problems/ugly-number-ii/description/
public class uglyNumber2 {
    public static void main(String[] args) {
        int n=10;
        System.out.println(nthUglyNumber(n));
    }
    static int nthUglyNumber(int n) {
        if (n <= 0) {
            return 0; // There is no 0th ugly number
        }

        int[] ugly = new int[n];
        ugly[0] = 1;

        int i2 = 0, i3 = 0, i5 = 0; // Pointers for 2, 3, and 5 multiples
        int nextMultipleOf2 = 2, nextMultipleOf3 = 3, nextMultipleOf5 = 5;

        for (int i = 1; i < n; i++) {
            int nextUgly = Math.min(nextMultipleOf2, Math.min(nextMultipleOf3, nextMultipleOf5));
            ugly[i] = nextUgly;

            if (nextUgly == nextMultipleOf2) {
                i2++;
                nextMultipleOf2 = ugly[i2] * 2;
            }
            if (nextUgly == nextMultipleOf3) {
                i3++;
                nextMultipleOf3 = ugly[i3] * 3;
            }
            if (nextUgly == nextMultipleOf5) {
                i5++;
                nextMultipleOf5 = ugly[i5] * 5;
            }
        }

        return ugly[n - 1];
    }
}


//        Intuition
//        The intuition behind this code is to efficiently find the nth ugly number, which is a positive integer that can be expressed as the product of powers of 2, 3, and 5. The code uses dynamic programming and multiple pointers to generate the ugly numbers in ascending order, ensuring that the nth ugly number is found efficiently.
//
//        Here's the step-by-step intuition:
//
//        The code starts with the knowledge that the first ugly number is 1, so it initializes the ugly array and sets ugly[0] = 1 to store this number.
//
//        It uses three pointers, i2, i3, and i5, to keep track of the next potential ugly numbers for multiples of 2, 3, and 5, respectively. The corresponding variables, nextMultipleOf2, nextMultipleOf3, and nextMultipleOf5, store the values of these potential multiples.
//
//        The code enters a loop to find the next ugly numbers (ugly[1] to ugly[n-1]). In each iteration:
//
//        a. It calculates the minimum value among nextMultipleOf2, nextMultipleOf3, and nextMultipleOf5. This minimum value represents the next ugly number and is stored in the ugly array.
//
//        b. It checks which multiple (2, 3, or 5) produced the next ugly number and updates the corresponding pointer and next multiple accordingly. This ensures that the generated ugly numbers are in ascending order.
//
//        After the loop completes, the ugly array contains the first n ugly numbers, with the nth ugly number being ugly[n - 1].
//
//        The code optimizes the generation of ugly numbers by considering multiples of 2, 3, and 5 separately and always selecting the smallest among these multiples.
//
//        Approach
//        The approach used in this code to find the nth ugly number is based on dynamic programming and the concept of using multiple pointers to generate the ugly numbers in ascending order. Here's a detailed explanation of the approach:
//
//        Initialization:
//
//        The code initializes an array called ugly with a size of n to store the ugly numbers. It also initializes the first element ugly[0] to 1, as 1 is the first ugly number.
//        Three pointers are introduced: i2, i3, and i5, each representing an index in the ugly array for the next potential ugly numbers for multiples of 2, 3, and 5, respectively.
//        Three variables, nextMultipleOf2, nextMultipleOf3, and nextMultipleOf5, are set to the initial values of the next potential multiples for 2, 3, and 5, starting at 2, 3, and 5, respectively.
//        Loop to Generate Ugly Numbers:
//
//        The code enters a loop that iterates from i = 1 to n - 1. This loop is responsible for finding the remaining ugly numbers (ugly[1] to ugly[n-1]).
//        Finding the Next Ugly Number:
//
//        In each iteration of the loop, the code calculates the minimum value among nextMultipleOf2, nextMultipleOf3, and nextMultipleOf5. This minimum value represents the next ugly number, and it is stored in the ugly array at index i.
//        Updating Pointers and Next Multiples:
//
//        The code checks which of the multiples (2, 3, or 5) produced the next ugly number. If, for example, nextMultipleOf2 was the minimum, it means the next ugly number is a multiple of 2. Therefore, it increments i2 and updates nextMultipleOf2 as ugly[i2] * 2.
//        Similarly, the code updates i3 and nextMultipleOf3 if 3 produced the minimum, and it updates i5 and nextMultipleOf5 if 5 produced the minimum.
//        Completion and Return:
//
//        After the loop completes, the ugly array contains the first n ugly numbers, and the nth ugly number is found at index n - 1 (i.e., ugly[n - 1]).
//        The approach efficiently generates the ugly numbers in ascending order by considering multiples of 2, 3, and 5 separately and always selecting the smallest among these multiples.
//
//        Complexity
//        Time complexity:
//        O(n)
//
//        Space complexity:
//        O(n)