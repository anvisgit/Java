import java.util.*;

public class ConcatinateArrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of arr1");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the length of arr2");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements of arr1");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of arr2");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] conc = new int[n1 + n2];
        int k = 0;
        for (int i = 0; i < n1; i++) {
            conc[k] = arr1[i];
            k++;
        }
        for (int i = 0; i < n2; i++) {
            conc[k] = arr2[i];
            k++;
        }
        System.out.println("Concatenated Array:");
        for (int i = 0; i < conc.length; i++) {
            System.out.print(conc[i] + " ");
        }

        sc.close();
    }
}
