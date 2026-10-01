import java.util.*;

public class LongestSequenceOf1s {

    // Longest run of 1s obtainable by flipping at most one 0 to 1
    static int longestSequence(int n) {
        if (n == -1) return 32;          // all bits already 1
        int current = 0, previous = 0, max = 1;

        while (n != 0) {
            if ((n & 1) == 1) {
                current++;
            } else {
                // if next bit is 0, the runs cannot be merged
                previous = ((n & 2) == 0) ? 0 : current;
                current = 0;
            }
            max = Math.max(previous + 1 + current, max);
            n >>>= 1;
        }
        return max;
    }

    // Example -> Input: 1775  ->  8
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        System.out.println("Binary = " + Integer.toBinaryString(n));
        System.out.println("Longest sequence of 1s after one flip = " + longestSequence(n));
        sc.close();
    }
}
