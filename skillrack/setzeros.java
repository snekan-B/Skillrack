package skillrack;
import java.util.*;

public class setzeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int mat[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int zr[]=new int[r];
        int zc[]=new int[c];

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(mat[i][j]==0)
                {
                    zr[i]=1;
                    zc[j]=1;
                }
            }
        }

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(zr[i]==1||zr[j]==1)
                    System.out.print(0+" ");
                else
                    System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }


    }


}
