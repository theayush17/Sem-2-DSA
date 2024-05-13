import java.util.*;
class q9
{
    public static double sumMajorDiagonal(double[][] m)
    {
        double sum=0;
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                if(i==j)
                    sum=sum+m[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter elements of 4x4 matrix: ");
        double [][] matrix= new double[4][4];
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
                matrix[i][j]=sc.nextDouble();
        }
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
                System.out.print(matrix[i][j]+" \t");
            System.out.println();
        }
        System.out.println("Sum of major diagonal elements= "+sumMajorDiagonal(matrix));
    }
}