import java.util.*;

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();}
        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("First duplicate: " + arr[i]);
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        if (!found) {
            System.out.println("No duplicates found");
        }
        sc.close();
    }
}
