import java.util.*;

public class longestOnes {

    public static int longest(int n) {

        String binary = Integer.toBinaryString(n);

        int count = 0;
        int max = 0;

        for (int i = 0; i < binary.length(); i++) {

            if (binary.charAt(i) == '1') {
                count++;
                max = Math.max(max, count);
            }
            else {
                count = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer: ");
        int n = sc.nextInt();

        System.out.println("Binary = " + Integer.toBinaryString(n));
        System.out.println("Longest sequence of 1s = " + longest(n));
    }
}
