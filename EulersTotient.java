// Euler's Totient Function φ(n) is the number of positive integers from 1 to n that are coprime with n (i.e., their GCD with n is 1).
import java.util.Scanner;
public class Main{
  static int funclol(int n){
    int res=n;
    for(int i=2;i*i<n;i++){
      if(n%i==0){
        while(n%i==0){
          n=n/i;
        }
        res-= res/;
      }
    }
    if(n>1){
      res-=res/n;
    }
    return res;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n");
    int n=sc.nextInt();
    System.out.print("Eulers Totient func: " funclol(n));
    sc.close();
  }
}
