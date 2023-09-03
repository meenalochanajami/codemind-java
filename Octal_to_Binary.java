import java.util.*;
public class Octal{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            String c=sc.next();
            int a=Integer.parseInt(c,8);
            String s=Integer.toBinaryString(a);
            System.out.println(s);
        }
    }
    
}