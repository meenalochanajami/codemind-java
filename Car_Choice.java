import java.util.Scanner;
public class Car{
    public static void main(String args[]){
        int t,x1,x2,y1,y2,i;
        float a,b;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(i=1;i<=t;i++){
            x1=sc.nextInt();
            x2=sc.nextInt();
            y1=sc.nextInt();
            y2=sc.nextInt();
            a=(float)x1/y1;
            b=(float)x2/y2;
            if(a>b){
             System.out.println("-1");   
            }
            else if(a<b){
               System.out.println("1");   
            }
            else{
                 System.out.println("0"); 
            }
        }
        
    } 
}