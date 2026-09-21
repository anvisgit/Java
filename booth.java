import java.util.*;

public class booth {

    public static int mult(int mand, int mier) {

        int p = 0;
        int count = Integer.SIZE;

        while (count > 0) {

            if ((mier & 1) == 1) {
                p += mand;
            }

            mand <<= 1;
            mier >>= 1;
            count--;
        }

        return p;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("multiplicand:");
        int mand = sc.nextInt();

        System.out.println("multiplier:");
        int mier = sc.nextInt();

        int res = mult(mand, mier);

        System.out.println(res);
    }
}
