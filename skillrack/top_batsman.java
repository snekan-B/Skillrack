package skillrack;
import java.util.*;
public class top_batsman {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int high=Integer.MIN_VALUE;
        String ans="";
        for(int i=0;i<n;i++)
        {
         String batsman=sc.next();
         String str[]=batsman.split(",");
         String name=str[0];
         int run=Integer.parseInt(str[1]);
         if(run>high)
         {
             high=run;
             ans=name;
         }

        }

        System.out.println(ans);
    }
}
