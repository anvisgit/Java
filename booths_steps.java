import java.util.Scanner;

public class BoothsAlgorithm {

    static long boothMultiply(int multiplicand, int multiplier, int bits) {

        long mask = (1L << bits) - 1;

        long M = multiplicand & mask;
        long A = 0;
        long Q = multiplier & mask;
        int qPrev = 0;

        System.out.println("\nInitial:");
        System.out.println("M  = " + toBinary(M, bits));
        System.out.println("A  = " + toBinary(A, bits));
        System.out.println("Q  = " + toBinary(Q, bits));
        System.out.println("Q-1 = " + qPrev);

        System.out.println("\n------------------------------------------------");
        System.out.println("Step\tA\t\tQ\t\tQ-1\tOperation");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < bits; i++) {

            int q0 = (int) (Q & 1);

            String operation;

            if (q0 == 1 && qPrev == 0) {
                A = (A - M) & mask;
                operation = "A = A - M";
            }
            else if (q0 == 0 && qPrev == 1) {
                A = (A + M) & mask;
                operation = "A = A + M";
            }
            else {
                operation = "No operation";
            }

            // Save Q0 before changing Q
            qPrev = q0;

            // Arithmetic right shift of [A | Q | Q-1]
            Q = (Q >> 1) | ((A & 1) << (bits - 1));
            A = arithmeticShift(A, bits);

            System.out.println(
                (i + 1) + "\t" +
                toBinary(A, bits) + "\t" +
                toBinary(Q, bits) + "\t" +
                qPrev + "\t" +
                operation
            );
        }

        return (A << bits) | Q;
    }

    static long arithmeticShift(long A, int bits) {

        // Convert to signed n-bit value
        if ((A & (1L << (bits - 1))) != 0)
            A |= (-1L << bits);

        A >>= 1;

        return A & ((1L << bits) - 1);
    }

    static String toBinary(long value, int bits) {
        String s = Long.toBinaryString(value);

        if (s.length() > bits)
            s = s.substring(s.length() - bits);

        while (s.length() < bits)
            s = "0" + s;

        return s;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter multiplicand: ");
        int m = sc.nextInt();

        System.out.print("Enter multiplier: ");
        int q = sc.nextInt();

        System.out.print("Enter number of bits: ");
        int bits = sc.nextInt();

        long product = boothMultiply(m, q, bits);

        System.out.println("\nFinal Product = " + product);

        sc.close();
    }
}
