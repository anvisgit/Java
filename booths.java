import java.util.*;
public class Booths {
    static long mul(int multiplicand, int multiplier, int bits) {
        long M = multiplicand;
        long A = 0;
        long Q = multiplier;
        int qm = 0;
        for (int i = 0; i < bits; i++) {
            int q0 = (int) Q & 1;
            if (qm == 0 && q0 == 1)
                A = A - M;
            if (qm == 1 && q0 == 0)
                A = A + M;
            Q = (Q >> 1) | ((A & 1) << (bits - 1));
            A >>= 1;
            qm = q0;
        }
        return (A << bits) | (Q & ((1L << bits) - 1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter multiplicand: ");
        int m = sc.nextInt();
        System.out.print("Enter multiplier: ");
        int q = sc.nextInt();
        System.out.print("Enter number of bits: ");
        int bits = sc.nextInt();
        System.out.println("Product = " + mul(m, q, bits));
        sc.close();
    }
}
