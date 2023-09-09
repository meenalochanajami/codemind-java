import java.util.*;
public class Primes{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++){
           int s=0;
           for(int j=1;j<=a[i];j++){
               if(a[i]%j==0){
                   s+=1;
               }
           }
         if(s==2){
             c+=1;
         }
        }
        System.out.println(c);
    }
}