import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number:");
    int n=sc.nextInt();
    int temp=n;
    int sum=0;
    while(temp>0){
      int d=temp%10;
      sum+=d*d*s;
      temp=temp/10;
    }
    if(sum==n){
      System.out.println("Armstrong Nummber");
    }else{
      System.out.println("Nah");
    }
  }
  
      
    
