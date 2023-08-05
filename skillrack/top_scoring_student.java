package skillrack;
import java.util.*;
public class top_scoring_student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int maxavg=0;
        String ans="";

        for(int i=0;i<n;i++)
        {
            String name=sc.next();
            String str[]=name.split(":");
            int sum=0;
            for(int j=0;j<n;j++)
            {
                if(j==0)
                    name=str[0];
                else
                    sum=sum+Integer.parseInt(str[j]);
            }
            int avg=sum/3;

            if(avg>maxavg)
            {
                maxavg=avg;
                ans=name;
            }
        }

        System.out.println(ans);

    }
}
