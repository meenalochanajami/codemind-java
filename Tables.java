import java.util.*;
public class Tables{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=sc.nextInt();
        for(int i=1;i<=l;i++){
            if(i%2!=0){
            int k=n*i;
            System.out.println(n+" "+"x"+" "+i+" "+"="+" "+k);
            }
        }
    }
    
}