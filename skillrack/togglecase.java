package skillrack;
import java.util.*;
public class togglecase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char val[]=str.toCharArray();
        String ans="";
        for(char i:val)
        {
            if(Character.isAlphabetic(i))
            {
                if(Character.isLowerCase(i))
                    ans=ans+Character.toUpperCase(i);
                else
                    ans=ans+Character.toLowerCase(i);
            }
            else
                ans=ans+i;
        }

        System.out.println(ans);
    }
}
