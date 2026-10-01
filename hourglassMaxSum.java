import java.util.*;

public class MaximumHourglass {
    static int maxHourglass(int[][] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i <= arr.length - 3; i++) {
            for (int j = 0; j <= arr[0].length - 3; j++) {
                int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                        + arr[i + 1][j + 1]
                        + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

                
                max= Math.max(max, sum);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.print("Enter columns: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        System.out.println("Enter matrix:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                arr[i][j] = sc.nextInt();

        System.out.println("Maximum hourglass sum = " + maxHourglass(arr));
        sc.close();
    }
}
