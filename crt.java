import javaa.util.*;
public class main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nectInt();
    int a[]=new int[n]; //remainder 
    int m[]=new int[n]; //mod
    int cm=1;
    for(int i =0;i<n;i++){
      a[i]=sc.nextInt();
    }
    for (int i = 0; i < n; i++) { 
      m[i] = in.nextInt(); 
    }
    for( int i=0;i<;i++){
      cm=cm*m[i];
    }
    int x=0;
    for(int i=0;i<n;i++){
      int cmi=cm/m[i];
      int inv=0;
        for(int j=1;j<m[i];j++){
          if((cmi*j)%m[i]==1){
            inv=j;
            break;
          }
        }
      x+=a[i]*cmi*inv;
      x=x%cm;

      System.out.println("X: "+x);
      
      
    }
    sc.close()

  }
}
