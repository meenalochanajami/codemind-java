import java.util.*;
public class Palindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        int k=n;
        while(n!=0){
            int r=n%10;
            s=s*10+r;
            n=n/10;
        }
        if(k!=s){
            System.out.println("False");
        }
        else{
            System.out.println("True");
        }
    }
}