import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("
    int n=sc.nextInt();

    int temp=n;
    int rev=0;
    while(temp>0){
      rev=rev*10+temp%10;
      temp=temp/10;
    }
    if(rev==n){
      System.out.println("yuh uh");
    }else{
      System.out.println("nuh uh");
    }
    
  }
}

