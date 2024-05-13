import java.util.*;
class q10
{
    public static int sum(int[][] m, int c)
    {
        for(int j=0; j<c; j++)
        {
            int sum=0;
            System.out.print("Sum of elements at column "+j+": ");
            for(int i=0; i<3; i++)
            {
                sum=sum+m[i][j];
            }
            System.out.println(sum);
        }
        return 1;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int[][] matrix= new int[3][4];
        for(int j=0; j<4; j++)
        {
            for(int i=0; i<3; i++)
                matrix[i][j]= sc.nextInt();
        }
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<4; j++)
                System.out.print(matrix[i][j]+" \t");
            System.out.println();
        }
        int call=sum(matrix, 4);
        System.out.println(call);
    }
}