import java.util.*;
public class Bill{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String n=sc.nextLine();
        int u=sc.nextInt();
        double un,su;
        if(u<=199){
            un=u*1.20;
        }
        else if(u>=200 && u<400){
            un=u*1.50;
        }
        else if(u>=400 && u<600){
            un=u*1.80;
        }
        else{
            un=u*2.00;
        }
        if(un>=400){
             su=un*0.15;
        }
        else
        {
              su=100;
        }
        double to=su+un;
        //System.out.println(s);
        //System.out.println(n);
        System.out.printf("%.2f",to);
        
        
    }
}