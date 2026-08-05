import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num=sc.next();
        int left=0;
        int right=num.length()-1;
        boolean flag=true;
        while(left<=right){
          if ((a == '0' && b == '0') ||(a == '1' && b == '1') ||(a == '8' && b == '8') ||(a == '6' && b == '9') ||(a == '9' && b == '6')) {
            left++;
            right--;
          }
          else{
            flag=false;
            break;
          }
        }
      if (flag) {
            System.out.println("Strobogrammatic Number");
        } else {
            System.out.println("Not a Strobogrammatic Number");
        }
      sc.close();
    }
}
