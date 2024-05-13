import java.util.*;
class q8
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter rows of 2-d array: ");
        int rows= sc.nextInt();
        System.out.print("Enter columns of 2-d array: ");
        int columns= sc.nextInt();
        int[][] matrix= new int[rows][columns];
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<columns; j++)
                matrix[i][j]= sc.nextInt();
        }
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<columns; j++)
                System.out.print(matrix[i][j]+" ");
            System.out.println();
        }
        int sum=0;
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<columns; j++)
                sum=sum+matrix[i][j];
        }
        System.out.println("Sum of all elements= "+sum);
    }
}