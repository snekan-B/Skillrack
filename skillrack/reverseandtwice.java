package skillrack;
import java.util.*;
public class reverseandtwice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int mat[][]=new int[t][n];
        int temp=n;
        for(int i=0;i<n;i++)
        {
            mat[0][i]=temp--;
        }

         temp=n-1;
        for(int i=1;i<t;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=2*mat[i-1][temp--];
            }
            temp=n-1;
        }

        for(int i=0;i<t;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

    }
}