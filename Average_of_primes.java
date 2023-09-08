import java.util.*;
public class Prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int su=0;
        int sum=0;
        for(int i=0;i<n;i++){
            int s=0;
            for(int j=1;j<=a[i];j++){
                if(a[i]%j==0){
                    s+=1;
                }
            }
            if(s==2){
                sum+=a[i];
                su+=1;
            }
        }
        double av=(double)sum/(double)su;
        System.out.printf("%.2f",av);
    }
}