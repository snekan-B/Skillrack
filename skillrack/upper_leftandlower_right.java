package skillrack;

import java.util.Scanner;

public class upper_leftandlower_right {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int flag=0;

        int sum=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                //sum=0;
                sum=0;
                if(i-1>=0 && j-1>=0)
                {
                    sum+=arr[i-1][j-1];
                }
                if(i+1<r && j+1<c)
                {
                    sum+=arr[i+1][j+1];
                }
                System.out.print(sum+" ");




            }
            System.out.println();
            sum=0;
        }
    }
}
