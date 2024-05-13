import java.util.*;
public class q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 4 fav colors: ");
        String []arr=new String[4];
        for(int i=0; i<4;i++){
            arr[i]=sc.next();
        }
        System.out.print("Enter your nth number fav color: ");
        int n= sc.nextInt();
        try
        {
            try
            {
                if(n>3||n<0)
                {
                    throw new exp("ArrayIndexOutOfBoundsException");
                }
                else
                    System.out.println(arr[n]);
            }
            catch(exp o)
            {
                System.err.println(o.getMessage());
            }

        }
        catch(NumberFormatException o)
        {
            System.err.println("NumberFormatException");
        }
    }
}
class exp extends Exception{
    exp(String Message){
        super(Message);
    }
}
