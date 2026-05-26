public class Main{
    public static void main(String[]a){
        for(int i=99;i>0;i--)
            System.out.println(i+" bottles of beer on the wall, "+i+
            " bottles of beer.\nTake one down and pass it around, "+
            (i-1==0?"no more":i-1)+" bottles of beer on the wall.\n");
    }
}
