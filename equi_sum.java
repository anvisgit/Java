import java.util.*;

public class MaximumEquilibriumSum {
    static int maxEquilibriumSum(int[] arr) {
        int total = 0;
        for (int x : arr)
            total += x;

        int prefix = 0;
        int best = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            prefix += arr[i];
            int suffix = total - prefix + arr[i];

            if (prefix == suffix)
                best = Math.max(best, prefix);
        }

        return best;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Maximum equilibrium sum = " + maxEquilibriumSum(arr));
        sc.close();
    }
}
