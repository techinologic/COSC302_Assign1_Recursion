import java.util.Scanner;

/**
 * Solution.java
 * Purpose: A program that implements a recursive method
 * that returns the number of 1’s in the binary representation
 * of N and uses the fact that this is equal to the number
 * of 1’s in the representation of N/2, plus 1, if N is odd.
 *
 * @author Paolo T. Inocencion
 * @version 1.0  09/05/17.
 */

public class Solution {

    /**
     * Recursive method that takes an integer n,
     * and counts the number of 1's in the binary
     * representation of user input N.
     *
     * @return An integer equal to the number of 1's in the binary
     * representation of user input N.
     */
    public static int getNumberOfOnes(int n) {

        if (n <= 0) {
            return 0;
        } else {
            return (n % 2) + getNumberOfOnes(n / 2);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        System.out.println("Number of 1's: " + getNumberOfOnes(N));

    }

}
