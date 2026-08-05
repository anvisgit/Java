//Write a Java program to print all prime numbers from 2 to N using the Sieve of Eratosthenes.
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter n");
    int n=nextInt();
    boolean[] prime=new boolean[n+1];
    for(int i=2;i<=n;i++){
      prime[i]=true;
    }
    for(i=2;i*i<n;i++){
      if(prime[i]){
        for(int j=i*i;j<=n;j++){
          prime[j]=false;
        }
      }
    }
    System.out.println("prime numbers:");
    for(int i=2;i<=n;i++){
      if(prime[i]){
        System.out.println(i);
      }
    }
  }
}


// input n
// create arr n
// for i<-2---->n:
//   prime i= true
//   end for
// for i<-2;i^2<n;i++:
//   if prime[i]:
//     for j->i^2;j<=n;j++:
//       prime j<-  false
//       end for
//     end if
//   end for
//   print if prime[i]==true
  
  
  
