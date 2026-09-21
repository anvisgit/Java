import java.util.*;

public class karatsuba {

    public static long mult(long x, long y) {

        if (x < 10 || y < 10) {
            return x * y;
        }

        int l1 = Long.toString(x).length();
        int l2 = Long.toString(y).length();

        int n = Math.max(l1, l2);
        int m = n / 2;

        long p = (long) Math.pow(10, m);

        long a = x / p;
        long b = x % p;

        long c = y / p;
        long d = y % p;

        long ac = mult(a, c);
        long bd = mult(b, d);

        long ext = mult(a + b, c + d) - ac - bd;

        return ac * p * p + ext * p + bd;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        long x = sc.nextLong();

        System.out.print("Enter second number: ");
        long y = sc.nextLong();

        System.out.println("Product = " + mult(x, y));
    }
}
