import java.util.*;
class q6
//{
//    public static boolean isOdd(int n)
//    {
//        String s= Integer.toBinaryString(n);
//        if(s.charAt(s.length()-1)=='1')
//            return true;
//        else
//            return false;
//    }
//    public static void main(String[] args)
//    {
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int n= sc.nextInt();
//        boolean call= isOdd(n);
//        System.out.print(n+" is an odd number: ");
//        System.out.println(call);
//    }
//}
{
    public static boolean isOdd(int n)
    {
        if((n&1)==1)
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        boolean call= isOdd(n);
        System.out.print(n+" is an odd number: ");
        System.out.println(call);
    }
}