import java.util.Scanner;
public class Read{
    public static void main(String args[]){
        float a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=(a+b)/2;
        System.out.printf("%.4f",c);
    }
}