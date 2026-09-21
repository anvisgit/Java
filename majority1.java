import java.util.*; 
public class ele{
  
  public static int func(int [] arr){
    int n= arr.length;
    for(int i=0;i<n;i++){
      int count=0;
      for(int j=0;j<n;j++){
        if(arr[i]==arr[j]){
          count++;
        }
      }
      if(count>n/2){
        return arr[i];
      }
    }
    return -1;
  }
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter number of elements");
    int n =sc.nextInt();
    int[] arr=new int[n];
    System.out.println("enter elements");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int res=func(arr);
    if(res==-1){
      System.out.println("no majority element");
    }
    else{
      System.out.println("Majority element:"+ res);
    }
    
  }
}
