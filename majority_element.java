import java.util.*;

public class MajorityElement {
    static int majorityElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }

            if (count > arr.length / 2)
                return arr[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int ans = majorityElement(arr);

        if (ans == -1)
            System.out.println("No majority element");
        else
            System.out.println("Majority element = " + ans);

        sc.close();
    }
}
