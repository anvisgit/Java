// Moore's Voting(arr)

// candidate = 0
// count = 0

// FOR each element in arr:
//     IF count == 0:
//         candidate = element
//         count = 1

//     ELSE IF element == candidate:
//         count++

//     ELSE:
//         count--

// // Verify candidate
// count = 0

// FOR each element in arr:
//     IF element == candidate:
//         count++

// IF count > n/2:
//     return candidate
// ELSE:
//     return -1



import java.util.*;

public class ele {

    public static int func(int[] arr) {

        int candidate = 0;
        int count = 0;

        // Find candidate
        for (int i = 0; i < arr.length; i++) {

            if (count == 0) {
                candidate = arr[i];
                count = 1;
            }
            else if (arr[i] == candidate) {
                count++;
            }
            else {
                count--;
            }
        }

        // Verify candidate
        count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == candidate) {
                count++;
            }
        }

        if (count > arr.length / 2) {
            return candidate;
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
