import java.util.*;
public class q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the integer: ");
        int n=sc.nextInt();
        System.out.println(fact(n));
    }
    static int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*fact(n-1);
    }
}
