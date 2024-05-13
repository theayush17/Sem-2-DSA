import java.util.*;
class q1
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter a number >2: ");
        int num= sc.nextInt();
        if(num>2)
        {
            int count=0;
            while(num>2)
            {
                num= num/2;
                count++;
            }
            System.out.println("The number of times one must repeatedly divide this number by 2 \n" +
                    "before getting a value less than 2 is "+count);
        }
        else
            System.out.println("Invalid input.");
    }
}