import java.util.Scanner;
public class Hand{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a,b;
        n=sc.nextInt();
        a=n*(n-1);
        b=a/2;
        System.out.println(b);
    }
}