import java.util.*;
class q5
{
    public static int sumOfDigits(int n)
    {
        int sum= 0;
        while(n>0 || sum>9)
        {
            if(n==0)
            {
                System.out.println(sum);
                n=sum;
                sum=0;
            }
            sum= sum+n%10;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number to get sum of digits till single digit is left: ");
        int num= sc.nextInt();
        System.out.println(sumOfDigits(num));
    }
}