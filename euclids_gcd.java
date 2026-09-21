import java.util.*;
public class euclid{
  public static int gcd(int a,int b){
    while(b!=0){
      int t=a%b;
      a=b;
      b=t;
    }
    return a;
  }
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter a,b ");
    int a=sc.nextInt();
    int b= sc.nextInt();
    System.out.printf("GCD: %d", gcd(a,b));
    
  }
}
