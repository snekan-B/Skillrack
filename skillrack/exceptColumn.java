package skillrack;
import java.util.*;
public class exceptColumn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mat[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }

        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                sum=sum+mat[j][i];
            }
            //System.out.println(sum);
            arr[i]=sum;
            sum=0;
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[j]-mat[i][j]+" ");
            }
            System.out.println();
        }

    }
}
