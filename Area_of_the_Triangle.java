import java.util.Scanner;
public class Operators
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        double a,b,c,s,d;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(a+b+c)/2;
        d=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",d);
        
    }
}