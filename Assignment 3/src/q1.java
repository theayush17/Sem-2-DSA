import java.util.*;
public class q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your lucky number: ");
        int num=sc.nextInt();
        try{
            if (num<0)
                throw new myExp("NumberFormatException");
            else
                System.out.print("your lucky number is: "+num);
        }
        catch(myExp e){
            System.err.println(e.getMessage());
        }
    }
}
class myExp extends Exception{
    myExp( String Message){
        super(Message);
    }

}
