import java.util.*;
class q3
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt(); int m=n;
        int sum=0;
        int pro=1;
        while(n>0)
        {
            sum= sum+n%10;
            n=n/10;
        }
        System.out.println("Sum of digits= "+sum);
        while(m!=0)
        {
            pro= pro*(m%10);
            m=m/10;
        }
        System.out.println("Product of digits= "+pro);
        if(sum==pro)
            System.out.println("Entered number is a spy number.");
        else
            System.out.println("Not a spy number.");
    }
}