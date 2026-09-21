import java.util.*;
public class ele {
    public static int func(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int midl = arr[n / 2];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == midl) {
                count++;
            }
        }
        if (count > n / 2) {
            return midl;
        }

        return -1;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int res = func(arr);

        if (res == -1) {
            System.out.println("No majority element");
        } else {
            System.out.println("Majority element: " + res);
        }
    }
}
