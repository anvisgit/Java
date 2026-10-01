import java.util.*;
public class MaximumProductSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
      
        int[] arr = new int[n];
      
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
      
        System.out.println("Maximum product = " + maxProduct(arr));
        sc.close();
    }
    static int maxProduct(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        int min = arr[0];
        int ans = arr[0];
        for (int i = 1; i < n; i++) {
            int x = arr[i];
            if (x < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(x, max * x);
            min = Math.min(x, min * x);
            ans = Math.max(ans, max);
        }
        return ans;
    }
}
