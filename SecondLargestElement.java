import java.util.*;
class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        while (n-- > 0) { 
            int x = sc.nextInt();

            if (x > max) {
                second = max;
                max = x;
            }
            else if (x > second && x != max) {
                second = x;
            }
        }

        System.out.println(second);
    }
}


// import java.util.*; 
// class SecondLargestElement{
//   public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     int n= sc.nextInt();
//     int[] arr=new int[n];

//     for(int i=0;i<n;i++){
//       arr[i]=sc.nextInt();
//     }
//     Arrays.sort(arr);
//     System.out.println(arr[arr.length-2]);
//   }

