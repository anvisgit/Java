import java.util.*;
public class Main{
  static int gcd(int a,int b){
    while(b>0){
      int temp=b;
      b=a%b;
      a=temp;
    }
    return a;
  }
  public static void main(String args[]{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n ");
    int n = sc.nextInt();
    int count=0;
    for(int i=1;i<=n;i++){
      if(gcd(i,n)==1){
        count++;
      }
    }
    System.out.println("eulers totient func:" + count);
    sc.close;

  }
}
