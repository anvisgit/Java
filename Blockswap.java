import java.util.*;
public class BlockSwap {
    static void swap(int[] arr, int a, int b, int d) {
        for (int i = 0; i < d; i++) {
            int temp = arr[a + i];
            arr[a + i] = arr[b + i];
            arr[b + i] = temp;
        }
    }
    static void rotate(int[] arr, int d) {
        int n = arr.length;
        if (n == 0) return;
        d %= n;
        if (d == 0) return;
      
        for (int i = d, j = n - d; ; ) {
            if (i <= j) {
                swap(arr, d - i, d + j - i, i);
                j -= i;
            } else {
                swap(arr, d - i, d, j);
                i -= j;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
      
        System.out.print("Enter " + n + " elements: ");
        for (int k = 0; k < n; k++)
            arr[k] = sc.nextInt();
      
        System.out.print("Enter rotation count d: ");
        int d = sc.nextInt();
      
        rotate(arr, d);
        System.out.println("Rotated array: " + Arrays.toString(arr));
        sc.close();
    }
}
