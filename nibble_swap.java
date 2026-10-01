import java.util.*;
public class swapnib{
  static int swap(int x){
    x=x&0xFF //keep last 8n bits of x
    return ((x&0x0F<<4)|(x&0xF0>>4)) //lower nibber move left and upper nibble move right further concatinate)
    }
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter a byte value: ");
    int x = sc.nextInt();
    System.out.println(swap(x));
    sc.close();
  }
}
