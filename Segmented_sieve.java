import java.util.Scanner;
public class Main{
  static boolean isPrimeFunc(int n){
    if(n<2){
      return false;
    }
    for(int i=2;i*i<n;i++){
      if(n%i==0){
        return false;
      }
    }
    return true;
  }
    
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter L");
    int l=sc.nextInt();
    System.out.println("Enter R");
    int r=sc.nextInt();
    for(int i=l;i<=r;i++){
      if(isPrimeFunc(i)){
        System.out.println(i);
      }
    }
  }
}
