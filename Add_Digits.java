import java.util.*;
public class Add{
   public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int sum=0;
       while(n>=9){
         sum=0;
         while(n>0){
           int r=n%10;
           sum=sum+r;
            n=n/10; 
       }
         n=sum;
       }
       System.out.println(sum);
   }
}