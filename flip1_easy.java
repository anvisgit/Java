import java.util.*;

public class LongestSequenceOf1s {
    static int longestSequence(int n) {
        if (n == -1)
            return 32;
        int current = 0, previous = 0, max = 1;
        while (n != 0) {
            if ((n & 1) == 1) {
                current++;
            } else {
                previous = (n & 2) != 0 ? current : 0;
                current = 0;
            }
            max = Math.max(max, previous + current + 1);
            n >>>= 1;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        System.out.println("Binary = " + Integer.toBinaryString(n));
        System.out.println("Longest sequence = " + longestSequence(n));
        sc.close();
    }
}
