public class OneThousandOneThPrime{
  static boolean isprime(int n){
    if(n< 2) return false;
    for( int i=2; i<n;i++){
      if(n%i==0) return false; 
    }
    return true;
  }
  
  public static void main(String[] args){
    int primecount=0;
    int number=1; 
    while(primecount<1001){
      number++; 
      if (isprime(number)){
        primecount++;
      }
    }
    System.out.println("1001th prime: "+ number);
  }
  
