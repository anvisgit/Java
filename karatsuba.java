import java.util.*;
public class KaratsubaAlgorithm {

    static long karatsuba(long x, long y) {
        if (x < 10 || y < 10) return x * y;
        int n = Math.max(Long.toString(x).length(), Long.toString(y).length());
        int half = n / 2;
        long p = (long) Math.pow(10, half);
      
        long a = x / p, b = x % p;
        long c = y / p, d = y % p;  

        long ac = karatsuba(a, c);
        long bd = karatsuba(b, d);
        long abcd = karatsuba(a + b, c + d);

        return ac * p * p + (abcd-ac-bd) * p + bd;
    }
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two non-negative numbers: ");
        long x = sc.nextLong();
        long y = sc.nextLong();
        System.out.println("Product = " + karatsuba(x, y));
        sc.close();
    }
}
